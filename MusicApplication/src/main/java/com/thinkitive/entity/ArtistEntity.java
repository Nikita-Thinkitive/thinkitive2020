package com.thinkitive.entity;

import javax.persistence.CascadeType;
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

	@OneToOne(targetEntity = ProfessionEntity.class,cascade =CascadeType.ALL)
	private ProfessionEntity profession;
	
	
	public ArtistEntity() {
		super();
	}

	public ArtistEntity(int id, String artistName, ProfessionEntity profession) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.profession = profession;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public ProfessionEntity getProfession() {
		return profession;
	}

	public void setProfession(ProfessionEntity profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "ArtistEntity [id=" + id + ", artistName=" + artistName + ", profession=" + profession + "]";
	}

}
