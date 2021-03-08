package com.thinkitive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thinkitive.entity.MusicRecordEntity;
import com.thinkitive.service.MusicRecordService;

@RestController
public class MusicRecordController {

	@Autowired
	MusicRecordService musicRecordService;

	@PostMapping("/music")
	public MusicRecordEntity insertMusicRecord(@RequestBody MusicRecordEntity musicRecord) {
		return musicRecordService.insertMusicRecord(musicRecord);
	}

	@GetMapping("/musics")
	public List<MusicRecordEntity> ShowMusicRecords() {
		return musicRecordService.showMusicRecords();
	}

	@GetMapping("/music/{name}")
	public List<MusicRecordEntity> findMusicByName(@PathVariable String name) {
		return musicRecordService.findMusicByName(name);
	}

	@GetMapping("/music/id/{id}")
	public List<MusicRecordEntity> findMusicById(@PathVariable Integer id) {
		return musicRecordService.findMusicById(id);
	}

	@DeleteMapping("/music/delete/{id}")
	public void removeMusicById(@PathVariable int id) {
		musicRecordService.removeMusic(id);
	}

}
