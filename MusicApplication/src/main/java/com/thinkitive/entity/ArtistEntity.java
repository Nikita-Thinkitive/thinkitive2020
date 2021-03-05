package com.thinkitive.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class ArtistEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String artistName;

	 @OneToOne(targetEntity = ProfessionEntity.class)
	 private ProfessionEntity profesion;

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	
	  public ProfessionEntity getProfesion() { return profesion; }
	  
	  public void setProfesion(ProfessionEntity profesion) { this.profesion =
	  profesion; }
	 

	@Override
	public String toString() {
		return "ArtistEntity [artistName=" + artistName + ", profesion]";
	}

}
