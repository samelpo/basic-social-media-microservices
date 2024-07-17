package uk.ac.york.eng2.videos.cli.domain;


import java.util.List;
import java.util.Set;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
// user, title, hashtags, like/dislike, watched by user
public class Video {
	
	private User creator;
	private String title;
	private List<String> hashtags;
	private Long id;
	private boolean viewed;
	private Set<User> likes;
	private Set<User> dislikes;
	private Set<User> viewers;
	private int likeCount;
	
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
	
	public Long getCreatorId() {
		return creator.getId();
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
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	@Override
	public String toString() {
		return "Video [creator=" + creator + ", title=" + title + ", hashtags=" + hashtags + ", id=" + id + ", viewed="
				+ viewed + ", likes=" + likes + ", dislikes=" + dislikes + "]";
	}
	
}
