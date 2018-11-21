package com.qa.persistence.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ratings {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long ratingID;
	@Column(length = 150)
	private String name;
	@Column(length = 10)
	private String rating;
	@Column(length = 150)
	private String comment;
	@Column(length = 50)
	private Long gameID;
//	@Column(length = 50)
//	private Long userID;
	
	public Ratings() {

	}
	
	public Ratings(Long ratingID, String name, String rating, String comment, Long gameID) {
		this.ratingID = ratingID;
		this.name = name;
		this.rating = rating;
		this.comment = comment;
		this.gameID = gameID;

	}

	public Long getRatingID() {
		return ratingID;
	}
	public void setRatingID(Long ratingID) {
		this.ratingID = ratingID;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getGameID() {
		return gameID;
	}
	public void setGameID(Long gameID) {
		this.gameID = gameID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
