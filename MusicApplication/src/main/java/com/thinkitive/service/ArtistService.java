package com.thinkitive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.Repository.ArtistRepository;
import com.thinkitive.entity.ArtistEntity;

@Service
public class ArtistService {
	
	@Autowired
	ArtistRepository artistRepository;
	
	
	public List<ArtistEntity> show()
	{
		return artistRepository.findAll();
	}
	
	public ArtistEntity insert(ArtistEntity artist)
	{
		return artistRepository.save(artist);
	}
	

}
