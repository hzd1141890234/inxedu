package com.demo.service.impl.system.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.mapper.system.main.mainMapper;
import com.demo.model.system.main.SYS_FUNCTION;
import com.demo.model.system.main.sys_role;
import com.demo.model.system.main.sys_role_function;



@Service
public class mainImp implements com.demo.service.interfaces.system.main.mainService {
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

	@Override
	public List<Map> selectSys_Role_PageById(String role_id) {
		
		return mainMapper.selectSys_Role_PageById(role_id);
	}
    @Transactional
	@Override
	public void deleteRole_Id(String Role_id) {
		try {
			 mainMapper.deleteRole_Id(Role_id);
			 mainMapper.deleteRole_srf(Role_id);
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
    @Transactional
	@Override
	public Integer insertRole_srf(sys_role_function sys_role_function) {
    	boolean id=true;
    List<Map>list=	mainMapper.selectRolE_srf(sys_role_function);
    
    
    
    System.out.println("@@@@@@@@@@@@"+list);
    System.out.println("@@@@@@@@@@@@"+sys_role_function);
    for (Map map : list) {
    	System.out.println(map.get("FUNCTION_ID").toString()+"2222222222222222");
    	Integer srf_function=new Integer(map.get("FUNCTION_ID").toString());
		for (Integer function_id: sys_role_function.getFunction_ids()) {
			if(srf_function==function_id){
				id=false;
			}
		}
		
		if(id){
			sys_role_function.setFunction_id(srf_function);
			mainMapper.deleteRole_srfByID(sys_role_function);
		}
	}
    	try {
    		 for (Integer function_id: sys_role_function.getFunction_ids()) {
    			 sys_role_function.setFunction_id(function_id);
    			 if( mainMapper.selectCount(sys_role_function)==0){
    				 mainMapper.insertRole_srf(sys_role_function);
    			 }
    			
    			 
    			
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return 1;
	}

	@Override
	public Integer createSys_Role(sys_role sys_role) {
		mainMapper.createSys_Role(sys_role);
		return 1;
	}

	@Override
	public Integer updateSys_Role(sys_role sys_role) {
		mainMapper.createSys_Role(sys_role);
		return 1;
	}

	
		
		

	

}
