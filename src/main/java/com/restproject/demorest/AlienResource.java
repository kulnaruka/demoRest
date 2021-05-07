package com.restproject.demorest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("aliens")
public class AlienResource{
	
	AliensRepo repo = new AliensRepo();
	
	@GET//request type default GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})//the Return format -->XML
	public ArrayList<Alien> getAliens() {
			return repo.getAlien();		
	}
	
	@GET//request type default GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})//the Return format -->XML
	public Alien getAliens(@PathParam("id") int id) {
			return repo.getAlien(id);	
	}	
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a) {
		System.out.println(a);
		repo.addAlien(a);
		return a;
	} 
}
