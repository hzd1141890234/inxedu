package com.demo.service.interfaces.system.main;

import com.demo.model.system.main.SYS_FUNCTION;

public interface authorityService {

	/**
	 * 创建权限
	 * @param sysFunction 权限对象
	 * @return 权限ID
	 */
	public int cresateSysFunction(SYS_FUNCTION sysFunction);
	/**
	 * 删除权限
	 * @param ids 权限ID串(12,13,14)
	 */
	public void deleteFunctionByIds(Integer[] ids);
	/**
	 * 修改权限
	 * 
	 */
	public void updateFunction(SYS_FUNCTION SYS_FUNCTION);
	
	public void updateParentId(SYS_FUNCTION SYS_FUNCTION);
}
