package com.cbi.footballPOC.model.player;

import com.cbi.footballPOC.model.item.Boots;
import com.cbi.footballPOC.model.stats.PhysicalStat;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Outfit {
    private Boots boots;

    public PhysicalStat getBonus() {
        PhysicalStat bonus = new PhysicalStat(0, 0, 0, 0);
        if (boots != null) {
            PhysicalStat bootStats = boots.getStats();
            float efficiencyRatio = (float) boots.getEfficiency() / 100;
            bonus.setStrength((int) (efficiencyRatio * (float)bootStats.getStrength()));
            bonus.setTechnical((int) (efficiencyRatio * (float) bootStats.getTechnical()));
            bonus.setSpeed((int) (efficiencyRatio * (float) bootStats.getSpeed()));
            bonus.setStamina((int) (efficiencyRatio *  (float) bootStats.getStamina()));
        }
        return bonus;
    }
}
