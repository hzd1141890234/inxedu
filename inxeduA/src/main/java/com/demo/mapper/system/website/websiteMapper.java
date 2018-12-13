package com.demo.mapper.system.website;

import java.util.List;
import java.util.Map;

import com.demo.model.system.main.website_guide;

public interface websiteMapper {
   public List<Map> select_website_guide(website_guide website_guide);
   public List<Map> select_website_type();
   public Map select_website_guideById(String id);
   public void deleteWebsite(String image_id);
   public void updateWebsite(String id);
   public void updateWebsites(website_guide website_guide);
   public void insertWebsite(website_guide website_guide);
   
}
