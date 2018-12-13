package com.demo.controller.system.mainHandler;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.system.main.edu_website_images;
import com.demo.model.system.main.media_List;
import com.demo.service.interfaces.system.media.mediaService;
import com.github.pagehelper.PageInfo;

@Controller
public class mediaHandler {
	@Autowired
	mediaService mediaService;

	@RequestMapping(value = "media_List", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody Map<String, Object> selectmedia_List(media_List temp) {

		PageInfo<media_List> pageinfo = mediaService.selectMedia_List(temp);
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("total", pageinfo.getTotal());
		map.put("rows", pageinfo.getList());
		return map;

	}

	@RequestMapping(value = "media_type", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody List<Map> selectEDU_WEBSITE_IMAGES_TYPE(media_List media_List) {
		List<Map> list = mediaService.selectEDU_WEBSITE_IMAGES_TYPE(media_List);
		return list;

	}
	@RequestMapping(value = "media_List", method = RequestMethod.DELETE)
    public @ResponseBody String deleteMedia( String image_id){
        mediaService.deleteMedia(image_id);
    	return "0";
    }
	
	@RequestMapping(value="media_Lists/ids",method=RequestMethod.POST)
	
	public @ResponseBody String articledel(Integer[] ids){
    
		mediaService.deleteMedias(ids);
		return "0";
	}
	
	@RequestMapping(value = "media_Lists", method = RequestMethod.POST,produces="text/html;charset=utf-8")
	public @ResponseBody String insertMedia(edu_website_images edu_website_images,
			@RequestParam(value="file", required=false)  MultipartFile imgfile,
			@RequestParam(value="preview_file", required=false)  MultipartFile preview_file,
			HttpServletRequest request){
		
	    String filename=imgfile.getOriginalFilename();
	    edu_website_images.setImage_url(filename);
	    
	  
	    String type=imgfile.getContentType();
	    Long size=imgfile.getSize();
	    
	    String preview_file_name=preview_file.getOriginalFilename();
	    edu_website_images.setPreview_url(preview_file.getOriginalFilename());
	    String preview_file_type=preview_file.getContentType();
	    Long preview_file_size=preview_file.getSize();
	    
		String path=request.getRealPath("upload");
		File file=new File(path+"//"+filename);
	
		try {
			FileUtils.copyInputStreamToFile(imgfile.getInputStream(),file);
			FileUtils.copyInputStreamToFile(preview_file.getInputStream(),file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		mediaService.insertMedia(edu_website_images);
		return "ok";
		
	}
}
