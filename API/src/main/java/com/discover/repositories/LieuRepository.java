package com.discover.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.discover.entities.LieuEntity;

@Repository
public interface LieuRepository extends JpaRepository<LieuEntity, Long>{
	
}
