package com.demo.service.impl.system.websiteImp;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.system.website.websiteMapper;
import com.demo.model.system.main.website_guide;
import com.demo.service.interfaces.system.website.websiteService;

@Service
public class websiteImp implements websiteService {
    @Autowired
    websiteMapper websiteMapper;
	@Override
	public List<Map> select_website_guide(website_guide website_guide) {
		
		return websiteMapper.select_website_guide(website_guide);
	}
	@Override
	public void deleteWebsite(String id) {
		websiteMapper.deleteWebsite(id);
		
	}
	@Override
	public void updateWebsite(String id) {
		websiteMapper.updateWebsite(id);
		
	}
	@Override
	public List<Map> select_website_type() {
	List<Map> list=websiteMapper.select_website_type();
		return list;
	}
	@Override
	public Map select_website_guideById(String id) {
		
		return websiteMapper.select_website_guideById(id);
	}
	@Override
	public void updateWebsites(website_guide website_guide) {
		websiteMapper.updateWebsites(website_guide);
		
	}
	@Override
	public void insertWebsite(website_guide website_guide) {
		websiteMapper.insertWebsite(website_guide);
		
	}



}
