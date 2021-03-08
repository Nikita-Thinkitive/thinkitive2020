package com.thinkitive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.Repository.ProfessionRepository;
import com.thinkitive.entity.ProfessionEntity;

@Service
public class ProfessionService {
	
	@Autowired
	ProfessionRepository professionRepository;
	
	public ProfessionEntity insertProfession(ProfessionEntity profession) {
		return professionRepository.save(profession);
	}
	
	public List<ProfessionEntity> showProfession()
	{
		return professionRepository.findAll();
	}

}
