package com.demo.model.system.main;

import java.util.List;

public class sys_role_function {
    private Integer role_id;
    private List<Integer> function_ids;
    @Override
	public String toString() {
		return "sys_role_function [role_id=" + role_id + ", function_ids=" + function_ids + ", function_id="
				+ function_id + "]";
	}
	private Integer function_id;
	                
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public List<Integer> getFunction_ids() {
		return function_ids;
	}
	public void setFunction_ids(List<Integer> function_ids) {
		this.function_ids = function_ids;
	}
	public Integer getFunction_id() {
		return function_id;
	}
	public void setFunction_id(Integer function_id) {
		this.function_id = function_id;
	}


}
