package com.demo.controller.mainHandler;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.main.SYS_FUNCTION;
import com.demo.service.interfaces.main.mainService;
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
    				method={RequestMethod.POST,RequestMethod.GET},
    				produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map select_Sys_Role_Page(Model model){
    	List<Map> select_Sys_Role_Pag=mainService.selectSys_Role_Page();
    	List<Map> select_Sys_Role=mainService.selectSys_Role();
    	Map <String,Object> map=new HashMap<String,Object>();
    	map.put("select_Sys_Role_Pag", select_Sys_Role_Pag);
    	map.put("select_Sys_Role", select_Sys_Role);
    	
		return map;
    }


    
	
}
