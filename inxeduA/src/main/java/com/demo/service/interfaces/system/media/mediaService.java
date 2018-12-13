package com.demo.service.interfaces.system.media;

import java.util.List;
import java.util.Map;

import com.demo.model.system.main.edu_website_images;
import com.demo.model.system.main.media_List;
import com.github.pagehelper.PageInfo;

public interface mediaService {
	 public List<Map> selectEDU_WEBSITE_IMAGES_TYPE(media_List media_List);
	 public PageInfo<media_List> selectMedia_List(media_List media_List);
	 public void deleteMedia(String image_id);
	 public void deleteMedias(Integer[] ids);
	 public void insertMedia(edu_website_images edu_website_images);
}
