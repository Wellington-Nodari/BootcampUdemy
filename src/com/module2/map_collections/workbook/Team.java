package com.module2.map_collections.workbook;

import java.util.*;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        setName(name);

        players = new HashMap<>();
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer(String position) {
        return players.get(position);
    }

    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }


}
