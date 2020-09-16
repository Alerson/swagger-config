package com.swagger.config.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.swagger.config.dao.Dao;
import com.swagger.config.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	Dao dao;

	@Override
	public List<String> list() {
		return dao.list();
	}

}
