package com.thinkitive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.Repository.ArtistRepository;
import com.thinkitive.entity.ArtistEntity;

@Service
public class ArtistService {
	
	@Autowired
	ArtistRepository repo;
	
	
	public List<ArtistEntity> show()
	{
		List al=repo.findAll();
		return al;
	}
	
	public ArtistEntity insert(ArtistEntity artist)
	{
		return repo.save(artist);
	}
	

}
