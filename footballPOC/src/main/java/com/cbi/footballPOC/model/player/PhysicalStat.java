package com.cbi.footballPOC.model.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhysicalStat {
    private int strength;
    private int technical;
    private int speed;
    private int stamina;

    public PhysicalStat add(PhysicalStat stat) {
        return new PhysicalStat(
                this.strength + stat.strength,
                this.technical + stat.technical,
                this.speed + stat.speed,
                this.stamina + stat.stamina
        );
    }
}
