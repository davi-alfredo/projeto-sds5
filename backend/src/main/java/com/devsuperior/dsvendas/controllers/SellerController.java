package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.services.SellerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/sellers")
@Tag(name="Sellers Api", description = "API responsible for sellers information")
public class SellerController {
	
	@Autowired
	private SellerService service;
	
	@Operation(description = "Gets sellers information")
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){		
		List<SellerDTO> list = service.findAll();		
		return ResponseEntity.ok(list);		
	}

}
