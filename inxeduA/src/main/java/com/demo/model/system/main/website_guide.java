package com.demo.model.system.main;

public class website_guide {
 private Integer id;
 private String type;
 private String name;
 private String url;
 private String newpage;
 private Integer ordernum;
 private Integer status;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getNewpage() {
	return newpage;
}

public void setNewpage(String newpage) {
	this.newpage = newpage;
}

public Integer getOrdernum() {
	return ordernum;
}

public void setOrdernum(Integer ordernum) {
	this.ordernum = ordernum;
}

public Integer getStatus() {
	return status;
}

public void setStatus(Integer status) {
	this.status = status;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "website_guide [id=" + id + ", type=" + type + ", name=" + name + ", url=" + url + ", newpage=" + newpage
			+ ", ordernum=" + ordernum + ", status=" + status + "]";
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}



}
