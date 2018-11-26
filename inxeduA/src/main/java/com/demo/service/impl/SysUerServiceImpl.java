package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.SysUserMapper;
import com.demo.model.SysUser;
import com.demo.service.interfaces.SysUserService;

@Service
public class SysUerServiceImpl implements SysUserService {

	@Autowired
	SysUserMapper sysUserMapper;
	@Override
	public List<SysUser> findSysUsers() {
		// TODO Auto-generated method stub
		return sysUserMapper.findSysUsers();
	}

}
