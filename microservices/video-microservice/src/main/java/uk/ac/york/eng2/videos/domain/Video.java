package uk.ac.york.eng2.videos.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
// creator, title, hashtags, like/dislike, watched by user
public class Video {
	
	@Column(nullable=false)
	private String title;
	
	@ElementCollection(targetClass=String.class, fetch=FetchType.EAGER)
	@Column(nullable=false)
	private List<String> hashtags;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private User creator;
	
	@JsonIgnore
	@ManyToMany
	private Set<User> viewers;
	
	private boolean viewed;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "video_user_likes")
	private Set<User> likes;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "video_user_dislikes")
	private Set<User> dislikes;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}
	
	public List<String> getHashtags() {
		return hashtags;
	}
	
	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}
	
	public Set<User> getViewers() {
		return viewers;
	}

	public void setViewers(Set<User> viewers) {
		this.viewers = viewers;
	}

	public boolean isViewed() {
		return viewed;
	}

	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}

	public Set<User> getLikes() {
		return likes;
	}

	public void setLikes(User user) {
		this.likes.add(user);
	}

	public Set<User> getDislikes() {
		return dislikes;
	}

	public void setDislikes(User user) {
		this.dislikes.add(user);
	}
	
}
