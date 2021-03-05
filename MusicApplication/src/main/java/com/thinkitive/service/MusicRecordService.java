package com.thinkitive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkitive.Repository.MusicRepository;
import com.thinkitive.entity.MusicRecordEntity;

@Service
public class MusicRecordService {
	
	@Autowired
	MusicRepository musicRepository;
	
	
	
	public MusicRecordEntity insertMusicRecord(MusicRecordEntity musicRecord)
	{
		return musicRepository.save(musicRecord);
	}
	
	
	public List<MusicRecordEntity> showMusicRecords() {
		return musicRepository.findAll();
	}
	
	public List<MusicRecordEntity> findMusicByName(String name)
	{
		return musicRepository.findByName(name);
	}
	
	
	public List<MusicRecordEntity> findMusicById(int id)
	{
		return musicRepository.findById(id);
	}
	
	
	public void removeMusic(int id)
	{
		musicRepository.deleteById(id);
	}

}
