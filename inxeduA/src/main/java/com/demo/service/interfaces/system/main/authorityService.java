package com.demo.service.interfaces.system.main;

import com.demo.model.system.main.SYS_FUNCTION;

public interface authorityService {

	/**
	 * ����Ȩ��
	 * @param sysFunction Ȩ�޶���
	 * @return Ȩ��ID
	 */
	public int cresateSysFunction(SYS_FUNCTION sysFunction);
	/**
	 * ɾ��Ȩ��
	 * @param ids Ȩ��ID��(12,13,14)
	 */
	public void deleteFunctionByIds(Integer[] ids);
	/**
	 * �޸�Ȩ��
	 * 
	 */
	public void updateFunction(SYS_FUNCTION SYS_FUNCTION);
	
	public void updateParentId(SYS_FUNCTION SYS_FUNCTION);
}
