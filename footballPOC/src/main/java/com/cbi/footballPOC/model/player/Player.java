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
    private PhysicalStat physicalBase;
    private Outfit outfit;

    public PhysicalStat getPhysicalBonus(){
        return outfit.getBonus();
    }

    public PhysicalStat getTotalPhysic(){
        return physicalBase.add(this.getPhysicalBonus());
    }
}
