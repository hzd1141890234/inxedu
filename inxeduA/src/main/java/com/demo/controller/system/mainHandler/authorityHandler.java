package com.demo.controller.system.mainHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.mapper.system.main.authorityMapper;
import com.demo.model.system.main.SYS_FUNCTION;
import com.demo.service.interfaces.system.main.authorityService;


@Controller
public class authorityHandler {
	/**
	 * ���Ȩ��
	 * @return
	 */
	@Autowired
	authorityService authorityService;
	@RequestMapping("addfunction")
	@ResponseBody
	public Map addFunction(SYS_FUNCTION sysFunction){
		try{
			authorityService.cresateSysFunction(sysFunction);
		}catch (Exception e) {
		}
		Map map = new HashMap<>();
		map.put("message", "success");
		return map;
	}
	/**
	 *ɾ��
	 * @return
	 */
	@RequestMapping(value="delfunction",method=RequestMethod.POST)
	public @ResponseBody Map articledel(Integer[] ids){
        Map map=new HashMap<>();
		authorityService.deleteFunctionByIds(ids);
		map.put("ok","ok");
		return map;
	}
	/**
	 *�޸�
	 * @return
	 */
	@RequestMapping(value="updatefunction",method=RequestMethod.POST)
	public @ResponseBody Map updateFunction(SYS_FUNCTION SYS_FUNCTION){
		System.out.println("���뷽��"+SYS_FUNCTION);
        Map map=new HashMap<>();
		authorityService.updateFunction(SYS_FUNCTION);
		map.put("ok","ok");
		return map;
	}
	@RequestMapping(value="updateParentId",method=RequestMethod.POST)
	public @ResponseBody boolean updateParentId(String PARENT_ID,String FUNCTION_ID, SYS_FUNCTION SYS_FUNCTION){
		
		SYS_FUNCTION.setFUNCTION_ID(new Integer(FUNCTION_ID));
		SYS_FUNCTION.setPARENT_ID(PARENT_ID);
		
		authorityService.updateParentId(SYS_FUNCTION);
		
		
		return true;
	}
	
}
