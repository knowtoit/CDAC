package com.demo.model;

public class Player {
    private int playerId;
    private String name;
    private String speciality;

    public Player(int playerId, String name, String speciality) {
        this.playerId = playerId;
        this.name = name;
        this.speciality = speciality;
    }

    public int getPlayerId() { return playerId; }
    public String getSpeciality() { return speciality; }

    public String toString() {
        return playerId + " " + name + " " + speciality;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}