package com.thinkitive.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkitive.entity.ProfessionEntity;

@Repository
public interface ProfessionRepository extends JpaRepository<ProfessionEntity, Integer>{

}
