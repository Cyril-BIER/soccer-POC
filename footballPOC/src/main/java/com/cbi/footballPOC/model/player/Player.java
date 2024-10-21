package com.cbi.footballPOC.model.player;

import lombok.Data;

@Data
public class Player {
    private String pseudo;
    private int energy;
    private int money;

    private RoleStat roleStat;
    private PhysicalStat basePhysic;
    private PhysicalStat bonusPhysic;
}
