package uk.ac.york.eng2.trending.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class Hashtag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private int numberOfLikes;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfLikes() {
		return numberOfLikes;
	}
	
	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}
	public Hashtag() {
	}
	
	public Hashtag(String name) {
		this.name = name;
		this.numberOfLikes = 0;
	}
	
	public void incrementLikes() {
		this.numberOfLikes++;
	}
}
