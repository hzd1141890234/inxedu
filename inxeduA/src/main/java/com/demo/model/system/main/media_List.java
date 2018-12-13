package com.demo.model.system.main;

public class media_List {
    private String title;
    private String image_url;
    private String link_address;
    private String type_name;
    private String type_id;
    private String image_id;
   
	public String getImage_id() {
		return image_id;
	}
	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}
	private Integer startrow;
    private Integer pagesize;
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public Integer getSERIES_NUMBER() {
		return SERIES_NUMBER;
	}
	public void setSERIES_NUMBER(Integer sERIES_NUMBER) {
		SERIES_NUMBER = sERIES_NUMBER;
	}
	private Integer SERIES_NUMBER;
	public Integer getStartrow() {
		return startrow;
	}
	public void setStartrow(Integer startrow) {
		this.startrow = startrow;
	}
	@Override
	public String toString() {
		return "media_List [title=" + title + ", image_url=" + image_url + ", link_address=" + link_address
				+ ", type_name=" + type_name + ", type_id=" + type_id + ", image_id=" + image_id + ", startrow="
				+ startrow + ", pagesize=" + pagesize + ", SERIES_NUMBER=" + SERIES_NUMBER + "]";
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
    
   
} 
