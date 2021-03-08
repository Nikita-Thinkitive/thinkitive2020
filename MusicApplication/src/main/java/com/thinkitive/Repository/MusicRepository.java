package com.thinkitive.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkitive.entity.MusicRecordEntity;

@Repository
public interface MusicRepository extends JpaRepository<MusicRecordEntity, Integer> {

	
	//@Query("select M from MusicRecordEntity  M where M.name =:name ")
	public List<MusicRecordEntity> findByName(String name);
	public List<MusicRecordEntity> findAllByNameAndId(String name, int id);
	List<MusicRecordEntity> findByNameOrId(String name, int id);
	public List<MusicRecordEntity> findById(int id);
}
