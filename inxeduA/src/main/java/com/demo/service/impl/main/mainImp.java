package com.demo.service.impl.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.main.mainMapper;
import com.demo.model.main.SYS_FUNCTION;

@Service
public class mainImp implements com.demo.service.interfaces.main.mainService {
    @Autowired
    mainMapper mainMapper;

	@Override
	public List<Map> selectMain(String parent_id) {
		
		
		return mainMapper.selectMain(parent_id) ;
	}

	@Override
	public List<Map> selectSys_Role_Page() {
		
		return mainMapper.selectSys_Role_Page();
	}

	@Override
	public List<Map> selectSys_Role() {
		
		return mainMapper.selectSys_Role();
	}
	

}
