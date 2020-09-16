package com.swagger.config.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface Api {

	@ApiOperation(value = "Get List", notes = "${SomeController.getList}")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna a lista de valores"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar esse recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção") })
	@GetMapping("/list")
	public ResponseEntity<List<String>> getList();

}
