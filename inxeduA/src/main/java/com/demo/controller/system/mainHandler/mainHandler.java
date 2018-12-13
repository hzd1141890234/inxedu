package com.demo.controller.system.mainHandler;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.system.main.SYS_FUNCTION;
import com.demo.model.system.main.sys_role;
import com.demo.model.system.main.sys_role_function;
import com.demo.service.interfaces.system.main.mainService;
import com.demo.util.JsonUtils;

@Controller
public class mainHandler {
	@Autowired
	mainService mainService;
	
    @RequestMapping(value="main",method={RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody List<Map> select_SYS_FUNCTION(String parent_id) {
    	
    	List<Map> list=mainService.selectMain("0");
    	System.out.println(list);
    	
		for (Map cmap : list) {
			cmap.put("cmap",mainService.selectMain(cmap.get("FUNCTION_ID").toString()));
			System.out.println(cmap);
		}
		 
		
		return list;
	}
    
    /*角色管理菜单树*/
    @RequestMapping(value="sys_role_page",
    				method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Map select_Sys_Role_Page(){
    	List<Map> select_Sys_Role_Pag=mainService.selectSys_Role_Page();
    	List<Map> select_Sys_Role=mainService.selectSys_Role();
    	Map <String,Object> map=new HashMap<String,Object>();
    	map.put("select_Sys_Role_Pag", select_Sys_Role_Pag);
    	map.put("select_Sys_Role", select_Sys_Role);
    	
		return map;
    }
    /*不同角色管理菜单树*/
    @RequestMapping(value="sys_role_pageById",
    				method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public List<Map> select_Sys_Role_PageById(String role_id){
    	
    	List<Map> list=mainService.selectSys_Role_PageById(role_id);
    	
		return list;
    }
    /*删除角色*/
    @RequestMapping(value="deleteRoleById",
    				method=RequestMethod.DELETE)
    @ResponseBody
    public Map deleteRole(String role_id){
    	System.out.println(role_id+"@@@@@@@@@@");
    	mainService.deleteRole_Id(role_id);
    	Map map = new HashMap<>();
		map.put("message", "ok");
		return map;
		
    }
    
    /*添加角色权限*/
    @RequestMapping(value="insertRoles",
    				method=RequestMethod.POST)
    @ResponseBody
    public Integer insertRole(sys_role_function sys_role_function){
    
    	
    	mainService.insertRole_srf(sys_role_function);
		return 1;
    }
    /*添加或修改角色*/
    @RequestMapping(value="createRole/{type}",
    				method=RequestMethod.POST)
    @ResponseBody
    public String createRole(sys_role sys_role,@PathVariable("type") int type){
        try {
        	if(sys_role.getRole_name()!=null && sys_role.getRole_name().trim().length()>0){
				if(type==1){
					mainService.createSys_Role(sys_role);
				}else if(type==2){
					mainService.updateSys_Role(sys_role);
				}
			}else{
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "ok";
    }




    
	
}
