package com.thinkitive.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkitive.entity.ArtistEntity;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity, String>{

}
