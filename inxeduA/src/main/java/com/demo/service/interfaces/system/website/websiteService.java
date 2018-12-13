package com.demo.service.interfaces.system.website;

import java.util.List;
import java.util.Map;

import com.demo.model.system.main.website_guide;

public interface websiteService {
	public List<Map> select_website_guide(website_guide website_guide);
	public Map select_website_guideById(String id);
	public List<Map> select_website_type();
	public void deleteWebsite(String id);
	public void updateWebsite(String id);
	public void updateWebsites(website_guide website_guide);
	public void insertWebsite(website_guide website_guide);
	
	
	
}
