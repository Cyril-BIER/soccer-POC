package com.cbi.footballPOC.model.item;


import com.cbi.footballPOC.model.stats.PhysicalStat;

public class Boots extends Equipment{

    public Boots(String name, Integer value, PhysicalStat stats, Integer efficiency, Integer durability  ) {
        this.name = name;
        this.value= value;
        this.stats = stats;
        this.efficiency = efficiency;
        this.durability = durability;
    }
}
