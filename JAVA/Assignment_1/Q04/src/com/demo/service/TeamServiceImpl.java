package com.demo.service;

import com.demo.dao.TeamDao;
import com.demo.model.Player;
import com.demo.model.Team;
import java.util.ArrayList;
import java.util.List;

public class TeamServiceImpl implements TeamService {
    private TeamDao dao;

    public TeamServiceImpl(TeamDao dao) {
        this.dao = dao;
    }

    public void addTeam(Team team) { dao.add(team); }
    public boolean deleteTeam(int teamId) { return dao.delete(teamId); }
    public List<Team> getAllTeams() { return dao.findAll(); }

    public boolean deletePlayer(int playerId) {
        for (Team team : dao.findAll()) {
            if (team.deletePlayer(playerId)) return true;
        }
        return false;
    }

    public List<Player> playersBySpeciality(String speciality) {
        List<Player> result = new ArrayList<>();
        for (Team team : dao.findAll()) {
            for (Player player : team.getPlayers()) {
                if (player.getSpeciality().equalsIgnoreCase(speciality)) result.add(player);
            }
        }
        return result;
    }

    public void addPlayer(int teamId, Player player) {
        Team team = dao.findById(teamId);
        if (team != null) team.addPlayer(player);
    }

    public void modifyCoach(int teamId, String coachName) {
        Team team = dao.findById(teamId);
        if (team != null) team.setCoachName(coachName);
    }
}