package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Games;
import com.qa.persistence.domain.Ratings;
import com.qa.persistence.domain.Users;
import com.qa.util.JSONUtil;


@Transactional(SUPPORTS)
@Default
public class igdbDBRepository implements igdbRepository {
	
	@Inject
	private JSONUtil util;
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	//GAMES
	
	public String getAllGames() {
		TypedQuery<Games> query = manager.createQuery("SELECT a FROM Games a", Games.class);
		return util.getJSONForObject(query.getResultList());
//		Query query1 = manager.createQuery("Select a FROM Games a");
//		Collection<Games> games = (Collection<Games>) query1.getResultList();
//		return util.getJSONForObject(games);
	}
	@Transactional(REQUIRED)
	public String createGame(String gameName) {
		Games aGame = util.getObjectForJSON(gameName, Games.class);
		manager.merge(aGame);
		return "{\"message\": \"Game has been sucessfully added\"}";
	}
	@Transactional(REQUIRED)
	public String updateGame(Long gameID, String gameName) {
		Games aGame = util.getObjectForJSON(gameName, Games.class);
		Games gameInDB = findGame(gameID);
		if (gameInDB != null) {
			gameInDB.setGameName(aGame.getGameName());
			gameInDB.setYearOfRelease(aGame.getYearOfRelease());
			gameInDB.setGenre(aGame.getGenre());
			gameInDB.setDeveloper(aGame.getDeveloper());
			gameInDB.setPublisher(aGame.getPublisher());
			gameInDB.setAgeRating(aGame.getAgeRating());
			gameInDB.setRatings(aGame.getRatings());
		}

		return "{\"message\": \"Game has been sucessfully updated\"}";
	}
	@Transactional(REQUIRED)
	public String deleteGame(Long gameID) {
		Games gameInDB = findGame(gameID);
		if (gameInDB != null) {
			manager.remove(gameInDB);
		}
		return "{\"message\": \"Game was sucessfully deleted\"}";
	}	
	
	public String getGame(Long gameID) {
		Games aGame = manager.find(Games.class, gameID);
		return util.getJSONForObject(aGame);
	}
	
	private Games findGame(Long gameID) {
		return manager.find(Games.class, gameID);
	}
	
	//USERS

	public String getAllUsers() {
		Query query2 = manager.createQuery("SELECT a FROM Users a");

		Collection<Users> Users = (Collection<Users>) query2.getResultList();

		return util.getJSONForObject(Users);
	}
	
	@Transactional(REQUIRED)
	public String createUser(String userName) {
		Users aUser = util.getObjectForJSON(userName, Users.class);
		manager.persist(aUser);
		return "{\"message\": \"A user has been sucessfully created\"}";
	}
	
	@Transactional(REQUIRED)
	public String updateUser(Long userID, String userName) {
		Users aUser = util.getObjectForJSON(userName,Users.class);
		Users userInDB = findUser(userID);
		if (userInDB != null) {
			userInDB.setUserName(aUser.getUserName());
		}
		return "{\"message\": \"User details have been sucessfully updated.\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteUser(Long userID) {
		Users User = findUser(userID);
		if (User != null) {
			manager.remove(User);
		}
		return "{\"message\": \"User was sucessfully deleted\"}";
	}

	public String getUser(Long userID) {
		Users aUser = findUser(userID);
		return util.getJSONForObject(aUser);
	}

	private Users findUser(Long userID) {
		return manager.find(Users.class, userID);
	}
	
	//RATINGS

	public String getAllRatings() {
		Query query3 = manager.createQuery("SELECT a FROM Ratings a");

		Collection<Ratings> ratings = (Collection<Ratings>) query3.getResultList();
		return util.getJSONForObject(ratings);
	}

	@Transactional(REQUIRED)
	public String createRatings(String rating) {
		Ratings aRating = util.getObjectForJSON(rating,Ratings.class);
		manager.persist(aRating);
		return "{\"message\": \"Rating has been sucessfully created\"}";
	}
	
	@Transactional(REQUIRED)
	public String updateRatings(Long ratingID, String rating) {
		Ratings aRating = util.getObjectForJSON(rating,Ratings.class);
		Ratings ratingInDB = findRating(ratingID);
		if (ratingInDB != null) {
			ratingInDB.setRating(aRating.getRating());
		}
		return "{\"message\": \"User details have been sucessfully updated.\"}";
	}

	@Transactional(REQUIRED)
	public String deleteRatings(Long ratingID) {
		Ratings aRating = findRating(ratingID);
		if (aRating != null) {
			manager.remove(aRating);
		}
		return "{\"message\": \"Rating was sucessfully deleted\"}";
	}

	public String getRatings(Long ratingID) {
		Ratings aRating = findRating(ratingID);
		return util.getJSONForObject(aRating);
	}


	private Ratings findRating(Long ratingID) {
		return manager.find(Ratings.class, ratingID);
	}

	
}

