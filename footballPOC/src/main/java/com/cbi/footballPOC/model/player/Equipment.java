package com.cbi.footballPOC.model.player;

import lombok.Data;

@Data
public class Equipment extends Item{
    protected PhysicalStat stats;
    protected int efficiency;
    protected int durability;
}
