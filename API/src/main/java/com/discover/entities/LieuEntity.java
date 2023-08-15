package com.discover.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="lieux")
public class LieuEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="lieu_id")
	private Long lieuId;
	
	@Column(name="lieu_name")
	private String lieuName;
	
	@Column(name="lieu_short_desc")
	private String lieuShortDesc;
	
	@Column(name="lieu_desc")
	private String lieuDesc;
	
	@Column(name="lieu_start")
	private int lieuStarts;
	
	@Column(name="lieu_city")
	private String lieuCity;
	
	@Column(name="lieu_lat")
	private float lieuLat;
	
	@Column(name="lieu_long")
	private float lieuLong;
	
	@Column(name="lieu_image")
	private String lieuImage;
	
	
	public LieuEntity() {
	}

	public LieuEntity(Long lieuId, String lieuName, String lieuShortDesc, String lieuDesc, int lieuStarts,
			String lieuCity, float lieuLat, float lieuLong, String lieuImage) {
		this.lieuId = lieuId;
		this.lieuName = lieuName;
		this.lieuShortDesc = lieuShortDesc;
		this.lieuDesc = lieuDesc;
		this.lieuStarts = lieuStarts;
		this.lieuCity = lieuCity;
		this.lieuLat = lieuLat;
		this.lieuLong = lieuLong;
		this.lieuImage = lieuImage;
	}
	
	
	public Long getLieuId() {
		return lieuId;
	}
	public void setLieuId(Long lieuId) {
		this.lieuId = lieuId;
	}
	public String getLieuName() {
		return lieuName;
	}
	public void setLieuName(String lieuName) {
		this.lieuName = lieuName;
	}
	public String getLieuShortDesc() {
		return lieuShortDesc;
	}
	public void setLieuShortDesc(String lieuShortDesc) {
		this.lieuShortDesc = lieuShortDesc;
	}
	public String getLieuDesc() {
		return lieuDesc;
	}
	public void setLieuDesc(String lieuDesc) {
		this.lieuDesc = lieuDesc;
	}
	public int getLieuStarts() {
		return lieuStarts;
	}
	public void setLieuStarts(int lieuStarts) {
		this.lieuStarts = lieuStarts;
	}
	public String getLieuCity() {
		return lieuCity;
	}
	public void setLieuCity(String lieuCity) {
		this.lieuCity = lieuCity;
	}
	public float getLieuLat() {
		return lieuLat;
	}
	public void setLieuLat(float lieuLat) {
		this.lieuLat = lieuLat;
	}
	public float getLieuLong() {
		return lieuLong;
	}
	public void setLieuLong(float lieuLong) {
		this.lieuLong = lieuLong;
	}
	public String getLieuImage() {
		return lieuImage;
	}
	public void setLieuImage(String lieuImage) {
		this.lieuImage = lieuImage;
	}


}
