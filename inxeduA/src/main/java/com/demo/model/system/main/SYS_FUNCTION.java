package com.demo.model.system.main;

import java.util.Date;
import java.util.List;

public class SYS_FUNCTION {
   private int FUNCTION_ID;
   private String PARENT_ID;
   private String FUNCTION_NAME;
   private String FUNCTION_URL;
   private int FUNCTION_TYPE;
   private Date CREATE_TIME;
   private int SORT;
  
   

//×Ó²Ë†Î
   private List<SYS_FUNCTION> childMenus;
public int getFUNCTION_ID() {
	return FUNCTION_ID;
}
public void setFUNCTION_ID(int fUNCTION_ID) {
	FUNCTION_ID = fUNCTION_ID;
}
public String getPARENT_ID() {
	return PARENT_ID;
}
public void setPARENT_ID(String pARENT_ID) {
	PARENT_ID = pARENT_ID;
}
public String getFUNCTION_NAME() {
	return FUNCTION_NAME;
}
public void setFUNCTION_NAME(String fUNCTION_NAME) {
	FUNCTION_NAME = fUNCTION_NAME;
}
public String getFUNCTION_URL() {
	return FUNCTION_URL;
}
public void setFUNCTION_URL(String fUNCTION_URL) {
	FUNCTION_URL = fUNCTION_URL;
}
public int getFUNCTION_TYPE() {
	return FUNCTION_TYPE;
}
public void setFUNCTION_TYPE(int fUNCTION_TYPE) {
	FUNCTION_TYPE = fUNCTION_TYPE;
}
public Date getCREATE_TIME() {
	return CREATE_TIME;
}
public void setCREATE_TIME(Date cREATE_TIME) {
	CREATE_TIME = cREATE_TIME;
}
public int getSORT() {
	return SORT;
}
public void setSORT(int sORT) {
	SORT = sORT;
}
public List<SYS_FUNCTION> getChildMenus() {
	return childMenus;
}
public void setChildMenus(List<SYS_FUNCTION> childMenus) {
	this.childMenus = childMenus;
}
@Override
public String toString() {
	return "SYS_FUNCTION [FUNCTION_ID=" + FUNCTION_ID + ", PARENT_ID=" + PARENT_ID + ", FUNCTION_NAME=" + FUNCTION_NAME
			+ ", FUNCTION_URL=" + FUNCTION_URL + ", FUNCTION_TYPE=" + FUNCTION_TYPE + ", CREATE_TIME=" + CREATE_TIME
			+ ", SORT=" + SORT + ", childMenus=" + childMenus + "]";
}

}

