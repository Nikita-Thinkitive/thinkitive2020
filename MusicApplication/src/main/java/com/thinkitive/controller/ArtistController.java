package com.thinkitive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.entity.ArtistEntity;
import com.thinkitive.service.ArtistService;

@RestController
public class ArtistController {

	@Autowired
	ArtistService artistService;

	@GetMapping("/artists")
	public List<ArtistEntity> showArtist() {
		return artistService.show();
	}

	@PostMapping("/artist")
	public void insert(@RequestBody ArtistEntity artist) {
		artistService.insert(artist);
	}

}
