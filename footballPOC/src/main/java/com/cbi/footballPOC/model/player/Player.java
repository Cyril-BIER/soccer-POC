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
    private Outfit outfit;

    public PhysicalStat getPhysicalBonus(){
        return outfit.getBonus();
    }

    public PhysicalStat getTotalPhysic(){
        return basePhysic.add(this.getPhysicalBonus());
    }
}
