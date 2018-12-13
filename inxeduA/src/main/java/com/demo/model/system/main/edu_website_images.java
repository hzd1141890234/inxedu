package com.demo.model.system.main;



public class edu_website_images {
  private Integer image_id;
  private String  image_url;
  private String link_address;
  private String title;
  private String type_id;
  



@Override
public String toString() {
	return "edu_website_images [image_id=" + image_id + ", image_url=" + image_url + ", link_address=" + link_address
			+ ", title=" + title + ", type_id=" + type_id + ", series_number=" + series_number + ", preview_url="
			+ preview_url + ", color=" + color + ", describe=" + describe + "]";
}
public Integer getImage_id() {
	return image_id;
}
public void setImage_id(Integer image_id) {
	this.image_id = image_id;
}
public String getImage_url() {
	return image_url;
}
public void setImage_url(String image_url) {
	this.image_url = image_url;
}
public String getLink_address() {
	return link_address;
}
public void setLink_address(String link_address) {
	this.link_address = link_address;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getType_id() {
	return type_id;
}
public void setType_id(String type_id) {
	this.type_id = type_id;
}
public String getSeries_number() {
	return series_number;
}
public void setSeries_number(String series_number) {
	this.series_number = series_number;
}
public String getPreview_url() {
	return preview_url;
}
public void setPreview_url(String preview_url) {
	this.preview_url = preview_url;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getDescribe() {
	return describe;
}
public void setDescribe(String describe) {
	this.describe = describe;
}
private String series_number;
  private String preview_url;
  private String color;
  private String describe;
}
