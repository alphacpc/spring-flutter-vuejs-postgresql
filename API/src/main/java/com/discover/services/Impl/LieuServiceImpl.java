package com.discover.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.discover.entities.LieuEntity;
import com.discover.repositories.LieuRepository;
import com.discover.services.LieuService;

@Service
public class LieuServiceImpl implements LieuService {
	
	private final LieuRepository lieuRepository;
	
	public LieuServiceImpl(LieuRepository lieuRepository) {
		this.lieuRepository = lieuRepository;
	}

	@Override
	public List<LieuEntity> findAllLieux() {
		return lieuRepository.findAll();
	}

	@Override
	public Optional<LieuEntity> findById(Long id) {
		return lieuRepository.findById(id);
	}

	@Override
	public LieuEntity saveLieu(LieuEntity lieuEntity) {
		return lieuRepository.save(lieuEntity);
	}

	@Override
	public LieuEntity updateLieu(LieuEntity lieuEntity) {
		return lieuRepository.save(lieuEntity);
	}

	@Override
	public void deleteLieu(Long id) {
		lieuRepository.deleteById(id);		
	}
	
	 
	
}
