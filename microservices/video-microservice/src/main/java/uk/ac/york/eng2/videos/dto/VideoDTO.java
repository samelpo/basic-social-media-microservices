package uk.ac.york.eng2.videos.dto;

import java.util.List;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.domain.User;

@Serdeable
public class VideoDTO {
	private String title;
	private Long creatorId;
	private List<String> hashtags;
	private Long id;
	
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
	
	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}
	
	public List<String> getHashtags() {
		return hashtags;
	}
	
	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}
}
