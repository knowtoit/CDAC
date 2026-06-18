package com.demo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements TeamInfo {
    private int teamId;
    private String teamName;
    private String coachName;
    private List<Player> players = new ArrayList<>();

    public Team(int teamId, String teamName, String coachName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.coachName = coachName;
    }

    public int getTeamId() { return teamId; }
    public List<Player> getPlayers() { return players; }
    public void addPlayer(Player player) { players.add(player); }
    public void setCoachName(String coachName) { this.coachName = coachName; }

    public boolean deletePlayer(int playerId) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPlayerId() == playerId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println(teamId + " " + teamName + " coach=" + coachName);
        players.forEach(System.out::println);
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getCoachName() {
        return coachName;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}