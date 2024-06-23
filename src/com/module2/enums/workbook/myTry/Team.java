package com.module2.enums.workbook.myTry;

import com.module2.enums.workbook.myTry.constants.Position;

import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<Position, String> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null/blank");
        this.name = name;
    }

    public String getPlayer(Position p) {
        return this.players.get(p);
    }

    public void setPlayer(Position position, String player) {
        if (position == null) { throw new IllegalArgumentException("Position cannot be null");}
        this.players.put(position, player);
    }

}
