package com.africa.types;

//import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Article {
	@Id
	@SequenceGenerator(
			name = "articles_sequence",
			sequenceName = "articles_sequence",
			allocationSize = 1
	)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "articles_sequence"
	)
	
	private Long articleid;
	private String title;
	private String describe;
	private String body;
	private String image_filename;
	private Integer likes;
	private Long categorid;
	private Long authorid;
	private String createdAt;
	private String lastUpdatedAt;
	
	/////////////////////////////
	/////// CONSTRUCTOR ////////
	///////////////////////////
	public Article() {
		super();
	}


	public Article(Long articleid, String title, String describe, String body, String image_filename, Integer likes, Long categorid,
			Long authorid, String createdAt, String lastUpdatedAt) {
		super();
		this.articleid = articleid;
		this.title = title;
		this.describe = describe;
		this.body = body;
		this.image_filename = image_filename;
		this.likes = likes;
		this.categorid = categorid;
		this.authorid = authorid;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
	}


	public Article(String title, String describe, String body, String image_filename, Integer likes, Long categorid, Long authorid,
			String createdAt, String lastUpdatedAt) {
		super();
		this.title = title;
		this.describe = describe;
		this.body = body;
		this.image_filename = image_filename;
		this.likes = likes;
		this.categorid = categorid;
		this.authorid = authorid;
		this.createdAt = createdAt;
		this.lastUpdatedAt = lastUpdatedAt;
	}


	public Article(String title, String describe, String body, String image_filename, Integer likes, Long categorid, Long authorid,
			String lastUpdatedAt) {
		super();
		this.title = title;
		this.describe = describe;
		this.body = body;
		this.image_filename = image_filename;
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


	public String getDescribe() {
		return describe;
	}


	public void setDescribe(String describe) {
		this.describe = describe;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
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


	public String getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}


	public String getLastUpdatedAt() {
		return lastUpdatedAt;
	}


	public void setLastUpdatedAt(String lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
	
	public String getImage_filename() {
		return image_filename;
	}


	public void setImage_filename(String image_filename) {
		this.image_filename = image_filename;
	}


	@Override
	public String toString() {
		return "Article [articleid=" + articleid + ", title=" + title + ", desc=" + describe + ", body=" + body + ", image="
				+ image_filename + ", likes=" + likes + ", categorid=" + categorid + ", authorid=" + authorid + "]";
	}

}
