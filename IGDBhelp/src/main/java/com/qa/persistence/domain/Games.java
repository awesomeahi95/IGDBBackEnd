package com.qa.persistence.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Games {
	
	public Games() {
	}
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long gameID;
	@Column(length = 150)
	private String gameName;
	@Column(length = 150)
	private String yearOfRelease;
	@Column(length = 50)
	private String genre;
	@Column(length = 50)
	private String developer;
	@Column(length = 50)
	private String publisher;
	@Column(length = 50)
	private String ageRating;
	@JoinColumn(name ="gameID", referencedColumnName = "gameID")
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Ratings> ratings;
	
	public Games(Long gameID, String gameName,String yearOfRelease, String genre, String developer, String publisher, String ageRating, List<Ratings> ratings) {
		this.gameID = gameID;
		this.gameName = gameName;
		this.yearOfRelease = yearOfRelease;
		this.genre = genre;
		this.developer = developer;
		this.publisher = publisher;
		this.ageRating = ageRating;
		this.ratings = ratings;
	}
	
	
	public Long getGameID() {
		return gameID;
	}
	public void setGameID(Long gameID) {
		this.gameID = gameID;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAgeRating() {
		return ageRating;
	}
	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}
	public List<Ratings> getRatings() {
		return ratings;
	}
	public void setRatings(List<Ratings> ratings) {
		this.ratings = ratings;
	}

}
