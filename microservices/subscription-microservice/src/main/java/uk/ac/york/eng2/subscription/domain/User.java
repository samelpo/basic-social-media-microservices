package uk.ac.york.eng2.subscription.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String username;
	
	@JsonIgnore
	@ManyToMany(mappedBy="viewers")
	private Set<Video> viewedVideos;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "likes")
	private Set<Video> likedVideos;

	@JsonIgnore
	@ManyToMany(mappedBy = "dislikes")
	private Set<Video> dislikedVideos;
	
	@ElementCollection(targetClass=String.class, fetch=FetchType.EAGER)
	@Column
	private Set<String> subbedTo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Video> getViewedVideos() {
		return viewedVideos;
	}

	public void setViewedVideos(Set<Video> viewedVideos) {
		this.viewedVideos = viewedVideos;
	}
	
	public Set<Video> getLikedVideos() {
		return likedVideos;
	}

	public void setLikedVideos(Video video) {
		this.likedVideos.add(video);
	}

	public Set<Video> getDislikedVideos() {
		return dislikedVideos;
	}

	public void setDislikedVideos(Video video) {
		this.dislikedVideos.add(video);
	}
	
	public Set<String> getSubbedTo() {
		return subbedTo;
	}
	
	public void setSubbedTo(Set<String> subbedTo) {
		this.subbedTo = subbedTo;
	}
	public void addSubbedTo(String hashtag) {
		this.subbedTo.add(hashtag);
	}
}