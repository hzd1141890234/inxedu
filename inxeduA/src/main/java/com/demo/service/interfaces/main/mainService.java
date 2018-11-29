package com.demo.service.interfaces.main;

import java.util.List;
import java.util.Map;

import com.demo.model.main.SYS_FUNCTION;

public interface mainService {
	public List<Map> selectMain(String parent_id);
	public List<Map> selectSys_Role_Page();
	public List<Map> selectSys_Role();
}
