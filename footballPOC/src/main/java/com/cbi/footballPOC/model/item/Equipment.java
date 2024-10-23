package com.cbi.footballPOC.model.item;

import com.cbi.footballPOC.model.stats.PhysicalStat;
import lombok.Data;

@Data
public class Equipment extends Item{
    protected PhysicalStat stats;
    protected int efficiency;
    protected int durability;
}
