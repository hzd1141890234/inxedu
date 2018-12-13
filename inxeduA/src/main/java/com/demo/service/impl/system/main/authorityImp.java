package com.demo.service.impl.system.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.mapper.system.main.authorityMapper;
import com.demo.model.system.main.SYS_FUNCTION;
import com.demo.service.interfaces.system.main.authorityService;

@Controller
public class authorityImp implements authorityService {
    @Autowired
    authorityMapper authorityMapper;
	@Override
	public int cresateSysFunction(SYS_FUNCTION sysFunction) {
		authorityMapper.cresateSysFunction(sysFunction);
		return 0;
	}
	@Override
	public void deleteFunctionByIds(Integer[] ids) {
		authorityMapper.deleteFunctionByIds(ids);
		
	}
	@Override
	public void updateFunction(SYS_FUNCTION SYS_FUNCTION) {
		authorityMapper.cresateSysFunction(SYS_FUNCTION);
		
	}
	@Override
	public void updateParentId(SYS_FUNCTION SYS_FUNCTION) {
		authorityMapper.updateParentId(SYS_FUNCTION);
		
	}

}
