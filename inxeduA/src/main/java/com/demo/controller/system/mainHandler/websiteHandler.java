package com.demo.controller.system.mainHandler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.system.main.website_guide;
import com.demo.service.interfaces.system.website.websiteService;

@Controller

public class websiteHandler {
	private String type;

	@Autowired
	websiteService websiteService;

	@RequestMapping(value = "website", method = RequestMethod.GET)
	public @ResponseBody List<Map> select_website_Guide(website_guide website_guide) {
		List<Map> list = websiteService.select_website_guide(website_guide);
		return list;
	}

	@RequestMapping(value = "website", method = RequestMethod.POST)
	public @ResponseBody List<Map> select_website_type() {
		List<Map> list = websiteService.select_website_type();
		return list;

	}

	@RequestMapping(value = "website/{id}", method = RequestMethod.GET)
	public @ResponseBody Map select_website_GuideById(@PathVariable("id") String id) {
		Map map = websiteService.select_website_guideById(id);
		return map;
	}

	@RequestMapping(value = "website", method = RequestMethod.DELETE)
	public @ResponseBody String deleteMedia(String id) {
		websiteService.deleteWebsite(id);
		return "0";
	}

	@RequestMapping(value = "websiteByID", method = RequestMethod.PUT)
	public @ResponseBody String updateMedia(String id) {
		websiteService.updateWebsite(id);
		return "0";
	}
	@RequestMapping(value = "websitesByID", method =RequestMethod.PUT)
	public @ResponseBody String updateMedias(website_guide website_guide) {
		
		websiteService.updateWebsites(website_guide);
		return "0";
	}
	
	@RequestMapping(value = "websites", method =RequestMethod.POST)
	public @ResponseBody String addMedias(website_guide website_guide) {
		 System.out.println("½øÈëÌí¼Ó");
		websiteService.insertWebsite(website_guide);
		return "0";
	}
}
