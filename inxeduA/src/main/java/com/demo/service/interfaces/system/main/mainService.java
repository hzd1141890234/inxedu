package com.demo.service.interfaces.system.main;

import java.util.List;
import java.util.Map;

import com.demo.model.system.main.SYS_FUNCTION;
import com.demo.model.system.main.sys_role;
import com.demo.model.system.main.sys_role_function;

public interface mainService {
	public List<Map> selectMain(String parent_id);
	public List<Map> selectSys_Role_Page();
	public List<Map> selectSys_Role_PageById(String role_id);
	public List<Map> selectSys_Role();
	
	public void deleteRole_Id(String Role_id);
	public Integer insertRole_srf(sys_role_function sys_role_function);
	//创建角色
	public Integer createSys_Role(sys_role sys_role);
	//修改角色
	public Integer updateSys_Role(sys_role sys_role);
}
