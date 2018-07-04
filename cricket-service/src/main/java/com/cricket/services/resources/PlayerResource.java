package com.cricket.services.resources;

import com.cricket.services.models.Player;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayerResource {

    private Map<String, Player> playerMap = new HashMap<>();

    @PostConstruct
    public void init(){
        playerMap.put("23", new Player("23", "nayan", "kumar", 27, "INDIA", 23980));
    }

    public Player getPlayerById(String id){
        return playerMap.get(id);
    }

    public List<Player> getAllPlayersByCountry(String county){
        return new ArrayList<>();
    }
    public List<Player> getAllPlayers(){
        return new ArrayList<>(playerMap.values());
    }
}
