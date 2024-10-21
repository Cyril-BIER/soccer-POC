package com.cbi.footballPOC.model.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    private String pseudo;
    private Integer energy;
    private Integer money;

    private RoleStat roleStat;
    private PhysicalStat basePhysic;
    private PhysicalStat bonusPhysic;

    public PhysicalStat getTotalPhysic(){
        return basePhysic.add(bonusPhysic);
    }
}
