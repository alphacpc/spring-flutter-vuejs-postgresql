package com.discover.services;

import java.util.List;
import java.util.Optional;

import com.discover.entities.LieuEntity;

public interface LieuService {

	List<LieuEntity> findAllLieux();
	Optional<LieuEntity> findById(Long id);
	LieuEntity saveLieu(LieuEntity lieuEntity);
	LieuEntity updateLieu(LieuEntity lieuEntity);
	void deleteLieu(Long id);  
}
