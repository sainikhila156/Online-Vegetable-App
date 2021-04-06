package com.cpg.onlineVegetableApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpg.onlineVegetableApp.entities.VegetableDTO;
import com.cpg.onlineVegetableApp.service.VegetableDTOservice;

@RestController
@RequestMapping("/vegt")
public class VegetableController {
	@Autowired
	private  VegetableDTOservice service;
	
	@PostMapping("/add")
	public VegetableDTO addVegetable(@RequestBody VegetableDTO dto){
		return service.addVegetable(dto);
		 
	}
}
