package com.demo.mapper.system.login;

import com.demo.model.system.login.sys_user;

public interface loginMapper {
  //判断有没有该用户
	public Integer selectSYS_USER(sys_user sys_function);
	
}
