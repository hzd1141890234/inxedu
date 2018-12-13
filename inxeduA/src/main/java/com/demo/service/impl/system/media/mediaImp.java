package com.demo.service.impl.system.media;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.system.media.mediaMapper;
import com.demo.model.system.main.edu_website_images;
import com.demo.model.system.main.media_List;
import com.demo.service.interfaces.system.media.mediaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class mediaImp implements mediaService {
    
	@Autowired
	mediaMapper mapper;
	@Override
	public List<Map> selectEDU_WEBSITE_IMAGES_TYPE(media_List media_List) {
		
		return mapper.selectEDU_WEBSITE_IMAGES_TYPE(media_List);
	}
	@Override
	public PageInfo<media_List> selectMedia_List(media_List media_List) {
		Integer startrow=media_List.getStartrow();
		Integer pagesize=media_List.getPagesize();
		PageHelper.offsetPage(startrow,pagesize);
		List<media_List> list=mapper.selectMedia_List(media_List);
		PageInfo<media_List> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}
	@Override
	public void deleteMedia(String image_id) {
		
		 mapper.deleteMedia(image_id);
	}
	@Override
	public void deleteMedias(Integer[] ids) {
		mapper.deleteMedias(ids);
	}
	@Override
	public void insertMedia(edu_website_images edu_website_images) {
		mapper.insertMedia(edu_website_images);
	}

	
	

}
