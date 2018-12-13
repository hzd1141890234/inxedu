package com.demo.service.impl.system.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.system.login.loginMapper;
import com.demo.model.system.login.sys_user;
import com.demo.service.interfaces.system.login.loginService;


@Service
public class loginImp implements loginService {
    @Autowired
    loginMapper LoginMapper;
	@Override
	public Integer selectSYS_USER(sys_user sys_function) {
		LoginMapper.selectSYS_USER(sys_function);
		return null;
	}

}
