package com.demo.service.impl.media;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mapper.media.mediaMapper;
import com.demo.service.interfaces.media.mediaService;

@Service
public class mediaImp implements mediaService {
    
	@Autowired
	mediaMapper mapper;
	@Override
	public List<Map> selectEDU_WEBSITE_IMAGES_TYPE() {
		// TODO Auto-generated method stub
		return mapper.selectEDU_WEBSITE_IMAGES_TYPE();
	}

}
