package com.demo.service;

import com.demo.model.Player;
import com.demo.model.Team;
import java.util.List;

public interface TeamService {
    void addTeam(Team team);
    boolean deleteTeam(int teamId);
    boolean deletePlayer(int playerId);
    List<Player> playersBySpeciality(String speciality);
    void addPlayer(int teamId, Player player);
    void modifyCoach(int teamId, String coachName);
    List<Team> getAllTeams();
}