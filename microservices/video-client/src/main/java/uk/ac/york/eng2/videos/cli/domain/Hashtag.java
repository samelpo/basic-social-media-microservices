package uk.ac.york.eng2.videos.cli.domain;


import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Hashtag {
	
	private Long id;

	private String name;
	
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
	
	@Override
	public String toString() {
		return "Hashtag [id=" + id + ", name=" + name + ", likes=" + numberOfLikes + "]";
	}

}
