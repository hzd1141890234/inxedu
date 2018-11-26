package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.SysUser;
import com.demo.service.interfaces.SysUserService;

@Controller
public class SysUserController {

	@Autowired
	SysUserService sysUserService;
	@RequestMapping("sysusers")
	public @ResponseBody List<SysUser> users(){
		List<SysUser> sylist = sysUserService.findSysUsers();
		return sylist;
	}
}
