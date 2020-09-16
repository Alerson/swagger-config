package com.swagger.config.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.config.api.Api;
import com.swagger.config.service.Service;

@RestController
@RequestMapping("api")
public class Controller implements Api {

	@Autowired
	Service service;

	public ResponseEntity<List<String>> getList() {
		return ResponseEntity.ok(service.list());
	}

}
