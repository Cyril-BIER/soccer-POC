package com.cbi.footballPOC.model.player;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhysicalStat {
    private Integer strength;
    private Integer technical;
    private Integer speed;
    private Integer stamina;

    public PhysicalStat add(PhysicalStat stat) {
        return new PhysicalStat(
                this.strength + stat.strength,
                this.technical + stat.technical,
                this.speed + stat.speed,
                this.stamina + stat.stamina
        );
    }
}
