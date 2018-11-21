package com.qa.business.service;

public interface IGDBService {
	
	    //Games
	
		String getAllGames();

		String createGame(String gameName);

		String deleteGame(Long gameID);

		String getGame(Long gameID);

		String updateGame(Long gameID, String gameName);
		
		//Users
		
		String getAllUsers();

		String createUser(String userName);

		String deleteUser(Long userID);

		String getUser(Long userID);

		String updateUser(Long userID, String userName);
		
		//Ratings
		
		String getAllRatings();

		String createRatings(String rating);

		String deleteRatings(Long ratingID);

		String getRatings(Long ratingID);

		String updateRatings(Long ratingID, String rating);

}
