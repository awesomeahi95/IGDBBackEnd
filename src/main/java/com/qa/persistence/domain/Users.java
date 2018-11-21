//package com.qa.persistence.domain;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Users {
//	
//	public Users() {
//	}
//	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Id
//	private Long userID;
//	@Column(length = 20)
//	private String userName;
//	
//	@JoinColumn(name ="userID", referencedColumnName = "userID")
//	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	private List<Ratings> ratings;
//	
//	public Users(Long userID, String userName, List<Ratings> ratings) {
//		this.userID = userID;
//		this.userName = userName;
//		this.ratings = ratings;
//	}
//	
//	public Long getUserID() {
//		return userID;
//	}
//	public void setUserID(Long userID) {
//		this.userID = userID;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}  
//	public List<Ratings> getRatings() {
//		return ratings;
//	}
//
//	public void setRatings(List<Ratings> ratings) {
//		this.ratings = ratings;
//	}
//	
//	
//	
//
//}
