package com.demo.dao;

import com.demo.model.Team;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamDaoImpl implements TeamDao {
    private List<Team> teams = new ArrayList<>();

    public void add(Team team) { teams.add(team); }

    public boolean delete(int teamId) {
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getTeamId() == teamId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public Team findById(int teamId) {
        for (Team team : teams) {
            if (team.getTeamId() == teamId) return team;
        }
        return null;
    }

    public List<Team> findAll() { return teams; }
}