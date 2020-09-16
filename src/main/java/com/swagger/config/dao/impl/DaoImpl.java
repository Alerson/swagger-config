package com.swagger.config.dao.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.swagger.config.dao.Dao;

@Repository
public class DaoImpl implements Dao {

	@Override
	public List<String> list() {
		return Collections.synchronizedList(Stream.of("Um", "Dois", "Tres", "Quatro", "Cinco").collect(Collectors.toList()));
	}

	

}
