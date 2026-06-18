package com.demo.test;

import com.demo.model.Player;
import com.demo.model.Team;
import com.demo.service.TeamService;

public class IplTestData {
    public static void load(TeamService service) {
        Team mi = new Team(1, "MI", "Boucher");
        mi.addPlayer(new Player(101, "Rohit", "batsman"));
        mi.addPlayer(new Player(102, "Bumrah", "bowler"));
        service.addTeam(mi);

        Team csk = new Team(2, "CSK", "Fleming");
        csk.addPlayer(new Player(201, "Dhoni", "wicketkeeper"));
        csk.addPlayer(new Player(202, "Ruturaj", "batsman"));
        service.addTeam(csk);
    }
}