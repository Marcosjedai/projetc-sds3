package com.devesuperior.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devesuperior.dsvendas.dto.SaleDTO;
import com.devesuperior.dsvendas.service.SaleService;


@RestController
@RequestMapping(value = "/sales")
public class SeleConctroller {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>>findALl(Pageable pageable){
		
		 Page<SaleDTO> list =  service.findAll(pageable);
		 return ResponseEntity.ok(list);
	}
	
}
