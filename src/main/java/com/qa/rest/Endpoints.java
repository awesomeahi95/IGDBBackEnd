package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.IGDBService;

@Path("/game")
public class Endpoints {

	@Inject
	private IGDBService service;

	// User Endpoints
	
//	@Path("/getAllUsers")
//	@GET
//	@Produces({ "application/json" })
//	public String getAllUsers() {
//		return service.getAllUsers();
//	}
//	
//	@Path("/getUser/{id}")
//	@GET
//	@Produces({ "application/json" })
//	public String getUser(@PathParam("id") Long userID) {
//		return service.getUser(userID);
//	}
//	
//	@Path("/createUser")
//	@POST
//	@Produces({ "application/json" })
//	public String createUser(String userName) {
//		return service.createUser(userName);
//	}
//	
//	@Path("/updateUser/{id}")
//	@PUT
//	@Produces({ "application/json" })
//	public String updateUser(@PathParam("id") Long userID, String userName) {
//		return service.updateUser(userID, userName);
//	}
//	
//	@Path("/deleteUser/{id}")
//	@DELETE
//	@Produces({ "application/json" })
//	public String deleteUser(@PathParam("id") Long userID) {
//		return service.deleteUser(userID);
//	}
	
	// Game Endpoints

	@Path("/getAllGames")
	@GET
	@Produces({ "application/json" })
	public String getAllGames() {
		return service.getAllGames();
	}

	@Path("/getGame/{id}")
	@GET
	@Produces({ "application/json" })
	public String getFlight(@PathParam("id") Long gameID) {
		return service.getGame(gameID);
	}

	@Path("/createGame")
	@POST
	@Produces({ "application/json" })
	public String createGame(String gameName) {
		return service.createGame(gameName);
	}

	@Path("/updateGame/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateGame(@PathParam("id") Long gameID, String gameName) {
		return service.updateGame(gameID, gameName);
	}
	
	@Path("/deleteGame/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteGame(@PathParam("id") Long gameID) {
		return service.deleteGame(gameID);
	}

	// Ratings Endpoints

	@Path("/getAllRatings")
	@GET
	@Produces({ "application/json" })
	public String getAllRatings() {
		return service.getAllRatings();
	}

	@Path("/getRating/{id}")
	@GET
	@Produces({ "application/json" })
	public String getRating(@PathParam("id") Long ratingID) {
		return service.getRatings(ratingID);
	}

	@Path("/createRating")
	@POST
	@Produces({ "application/json" })
	public String createRating(String rating) {
		return service.createRatings(rating);
	}

	@Path("/updateRating/{id}")
	@PUT
	@Produces({ "application/json" })
	public String updateRating(@PathParam("id") Long ratingID, String rating) {
		return service.updateRatings(ratingID, rating);
	}

	@Path("/deleteRating/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteRating(@PathParam("id") Long ratingID) {
		return service.deleteRatings(ratingID);
	}
	
	public void setService(IGDBService service) {
		this.service = service;
	}

}
