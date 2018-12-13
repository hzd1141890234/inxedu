package com.demo.service.impl.web.course;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.web.course.course_Mapper;
import com.demo.service.interfaces.web.courses.course_subject;

@Service
public class courseImp implements course_subject {
    @Autowired
   course_Mapper course_Mapper;
	@Override
	public List<Map> selectsubjectList(Integer parent_id) {
		return course_Mapper.selectsubjectList(0);
	}

}
