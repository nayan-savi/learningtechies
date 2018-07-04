package com.cricket.services.service;

import com.cricket.services.models.Player;
import com.cricket.services.resources.PlayerResource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/cricket/rest")
public class PlayerService {

    @Inject
    private PlayerResource playerResource;

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPlayerById(@PathParam("id") final String id){
        Player player = playerResource.getPlayerById(id);
        return Response.ok(player).build();
    }

    /*public List<Player> getAllPlayersByCountry(String county){
        return new ArrayList<>();
    }*/

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPlayers(){
        List<Player> players = playerResource.getAllPlayers();
        return Response.ok(players).build();
    }
}
