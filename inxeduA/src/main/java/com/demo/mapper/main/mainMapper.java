package com.demo.mapper.main;

import java.util.List;
import java.util.Map;

import com.demo.model.main.SYS_FUNCTION;

public interface mainMapper {
   public List<Map> selectMain(String parent_id);
   public List<Map> selectSys_Role_Page();
   public List<Map> selectSys_Role();
}
