package com.thinkitive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.entity.ProfessionEntity;
import com.thinkitive.service.ProfessionService;

@RestController
public class ProfessionController {
	
	@Autowired
	ProfessionService professionService;

	@PostMapping("/profession")
	public ProfessionEntity insertProfession(@RequestBody ProfessionEntity profession) {
		return professionService.insertProfession(profession);
	}

	@GetMapping("/professions")
	public List<ProfessionEntity> show() {
		return professionService.showProfession();
	}
	
}
