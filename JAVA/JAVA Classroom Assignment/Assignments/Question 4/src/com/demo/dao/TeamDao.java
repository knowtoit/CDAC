package com.demo.dao;

import com.demo.model.Team;
import java.util.List;

public interface TeamDao {
    void add(Team team);
    boolean delete(int teamId);
    Team findById(int teamId);
    List<Team> findAll();
}