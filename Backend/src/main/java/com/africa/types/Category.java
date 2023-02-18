package com.africa.types;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Category {
	
	@Id
	@SequenceGenerator(
			name = "category_sequence",
			sequenceName = "category_sequence",
			allocationSize = 1
	)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "category_sequence"
	)
	
	private Long id_category;
	private String titleCategory;
	private String desc_category;
	private String createdAt_category;
	private String lastUpdated_category;
	
	public Category() {
		super();
	}

	public Category(Long id_category, String title_category, String desc_category, String createdAt_category,
			String lastUpdated_category) {
		super();
		this.id_category = id_category;
		this.titleCategory = title_category;
		this.desc_category = desc_category;
		this.createdAt_category = createdAt_category;
		this.lastUpdated_category = lastUpdated_category;
	}

	public Category(String title_category, String desc_category, String createdAt_category,
			String lastUpdated_category) {
		super();
		this.titleCategory = title_category;
		this.desc_category = desc_category;
		this.createdAt_category = createdAt_category;
		this.lastUpdated_category = lastUpdated_category;
	}

	public Long getId_category() {
		return id_category;
	}

	public void setId_category(Long id_category) {
		this.id_category = id_category;
	}

	public String getTitle_category() {
		return titleCategory;
	}

	public void setTitle_category(String title_category) {
		this.titleCategory = title_category;
	}

	public String getDesc_category() {
		return desc_category;
	}

	public void setDesc_category(String desc_category) {
		this.desc_category = desc_category;
	}

	public String getCreatedAt_category() {
		return createdAt_category;
	}

	public void setCreatedAt_category(String createdAt_category) {
		this.createdAt_category = createdAt_category;
	}

	public String getLastUpdated_category() {
		return lastUpdated_category;
	}

	public void setLastUpdated_category(String lastUpdated_category) {
		this.lastUpdated_category = lastUpdated_category;
	}

	@Override
	public String toString() {
		return "Category [id_category=" + id_category + ", title_category=" + titleCategory + ", desc_category="
				+ desc_category + ", createdAt_category=" + createdAt_category + ", lastUpdated_category="
				+ lastUpdated_category + "]";
	}
	

}
