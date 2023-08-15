package com.discover.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entities.LieuEntity;
import com.discover.services.LieuService;

@RestController
@RequestMapping("/lieux")
public class LieuController {
	
	private final LieuService lieuService;
	
	public LieuController(LieuService lieuService) {
		this.lieuService = lieuService;
	}
	
	@GetMapping
	public List<LieuEntity> findAllLieux(){
		return lieuService.findAllLieux();
	}
	
	@GetMapping("/{id}")
	public Optional<LieuEntity> findLieu(@PathVariable("id") Long id){
		return lieuService.findById(id);
	}
	
	@PostMapping
	public LieuEntity saveLieu(@RequestBody LieuEntity lieuEntity) {
		return lieuService.saveLieu(lieuEntity);
	}
	
	@PutMapping
	public LieuEntity updateLieu(@RequestBody LieuEntity lieuEntity) {
		return lieuService.updateLieu(lieuEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLieu(@PathVariable("id") Long id) {
		lieuService.deleteLieu(id);
	}
	
}
