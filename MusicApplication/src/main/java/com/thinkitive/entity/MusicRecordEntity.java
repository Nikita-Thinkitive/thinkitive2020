package com.thinkitive.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="music_record")
public class MusicRecordEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
	private Date dateOfRelease;

	@OneToOne(targetEntity = ArtistEntity.class)
	private ArtistEntity artists;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(Date dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public ArtistEntity getArtists() {
		return artists;
	}

	public void setArtists(ArtistEntity artists) {
		this.artists = artists;
	}

	@Override
	public String toString() {
		return "MusicRecordEntity [id=" + id + ", name=" + name + ", dateOfRelease=" + dateOfRelease + ", artists="
				+ artists + "]";
	}
	
	
	
	
	

}
