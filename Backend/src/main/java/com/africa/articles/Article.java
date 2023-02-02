package com.africa.articles;

import java.io.File;
import java.time.LocalDate;

public class Article {
	
	private Long articleid;
	private String title;
	private String desc;
	private String body;
	private File image;
	private Integer likes;
	private Long categorid;
	private Long authorid;
	private LocalDate createdAt;
	private LocalDate lastUpdatedAt;
	
	/////////////////////////////
	/////// CONSTRUCTOR ////////
	///////////////////////////
	public Article() {
		super();
	}


	public Article(Long articleid, String title, String desc, String body, File image, Integer likes, Long categorid,
			Long authorid, LocalDate createdAt, LocalDate lastUpdatedAt) {
		super();
		this.articleid = articleid;
		this.title = title;
		this.desc = desc;
		this.body = body;
		this.image = image;
		this.likes = likes;
		this.categorid = categorid;
		this.authorid = authorid;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
	}


	public Article(String title, String desc, String body, File image, Integer likes, Long categorid, Long authorid,
			LocalDate createdAt, LocalDate lastUpdatedAt) {
		super();
		this.title = title;
		this.desc = desc;
		this.body = body;
		this.image = image;
		this.likes = likes;
		this.categorid = categorid;
		this.authorid = authorid;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
	}


	public Article(String title, String desc, String body, File image, Integer likes, Long categorid, Long authorid,
			LocalDate lastUpdatedAt) {
		super();
		this.title = title;
		this.desc = desc;
		this.body = body;
		this.image = image;
		this.likes = likes;
		this.categorid = categorid;
		this.authorid = authorid;
		this.lastUpdatedAt = lastUpdatedAt;
	}

	
	//////////////////////////////////
	////// GETTER AND SETTER ////////
	////////////////////////////////
	public Long getArticleid() {
		return articleid;
	}


	public void setArticleid(Long articleid) {
		this.articleid = articleid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public File getImage() {
		return image;
	}


	public void setImage(File image) {
		this.image = image;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public Long getCategorid() {
		return categorid;
	}


	public void setCategorid(Long categorid) {
		this.categorid = categorid;
	}


	public Long getAuthorid() {
		return authorid;
	}


	public void setAuthorid(Long authorid) {
		this.authorid = authorid;
	}


	public LocalDate getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDate getLastUpdatedAt() {
		return lastUpdatedAt;
	}


	public void setLastUpdatedAt(LocalDate lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}


	@Override
	public String toString() {
		return "Article [articleid=" + articleid + ", title=" + title + ", desc=" + desc + ", body=" + body + ", image="
				+ image + ", likes=" + likes + ", categorid=" + categorid + ", authorid=" + authorid + "]";
	}
	
	
	
	
	

}
