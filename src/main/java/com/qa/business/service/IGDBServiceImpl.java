package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.igdbDBRepository;

public class IGDBServiceImpl implements IGDBService{
	
	@Inject
	private igdbDBRepository repo;
	
	//Games
	
	public String getAllGames() {
		return repo.getAllGames();
	}

	public String createGame(String gameName) {
		return repo.createGame(gameName);
	}

	public String deleteGame(Long gameID) {
		return repo.deleteGame(gameID);
	}

	public String getGame(Long gameID) {
		return repo.getGame(gameID);
	}

	public String updateGame(Long gameID, String gameName) {
		return repo.updateGame(gameID,gameName);
	}
	
	//Users
	
//	public String getAllUsers() {
//		return repo.getAllUsers();
//	}
//	
//	public String getUser(Long userId) {
//		return repo.getUser(userId);
//	}
//
//	public String createUser(String userName) {
//		return repo.createUser(userName);
//	}
//
//	public String updateUser(Long userId, String userName) {
//		return repo.updateUser(userId, userName);
//	}
//
//	public String deleteUser(Long userId) {
//		return repo.deleteUser(userId);
//	}

	//Ratings
	
	public String getAllRatings() {
		return repo.getAllRatings();
	}

	public String createRatings(String rating) {
		return repo.createRatings(rating);
	}

	public String deleteRatings(Long ratingID) {
		return repo.deleteRatings(ratingID);
	}

	public String getRatings(Long ratingID) {
		return repo.getRatings(ratingID);
	}

	public String updateRatings(Long ratingID, String rating) {
		return repo.updateRatings(ratingID,rating);
	}

}
