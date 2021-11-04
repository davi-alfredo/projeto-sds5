package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(value = "/sales")
@Tag(name="Sales Api", description = "API responsible for sales information")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@Operation(description = "Gets paginated sales information")
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){		
		Page<SaleDTO> list = service.findAll(pageable);		
		return ResponseEntity.ok(list);		
	}
	
	@Operation(description = "Get Amount agouped by seller")
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){		
		List<SaleSumDTO> list = service.amountGroupedBySeller();		
		return ResponseEntity.ok(list);		
	}
	
	@Operation(description = "Get success rate per seller")
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){		
		List<SaleSuccessDTO> list = service.successGroupedBySeller();		
		return ResponseEntity.ok(list);		
	}
}
