package com.huawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.mapper.PersionMapper;
import com.huawei.model.Persion;
import com.huawei.service.IPersionService;

@Service
public class PersionServiceImpl implements IPersionService {
    @Autowired
    private PersionMapper persionMapper;

	public List<Persion> loadPersons() {
		// TODO Auto-generated method stub
		return persionMapper.queryAll();
	}


    
}