package com.cbi.footballPOC.model.player;

import com.cbi.footballPOC.model.item.Boots;
import com.cbi.footballPOC.model.stats.PhysicalStat;
import com.cbi.footballPOC.model.stats.RoleStat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getTotalPhysic() {
        PhysicalStat playerBasePhysic = new PhysicalStat(3, 3, 3, 3);
        Boots boots = new Boots(
                "Mercurial",
                120,
                new PhysicalStat(0,10,8,0),
                85,
                7
        );
        Outfit outfit = new Outfit(boots);
        Player player = new Player("User", 100, 0, new RoleStat(), playerBasePhysic, outfit);

        PhysicalStat actual = player.getTotalPhysic();
        PhysicalStat expected = new PhysicalStat(3, 11, 9, 3);
        assertEquals(expected, actual);
    }

    @Test
    void getPhysicalBonus() {
        PhysicalStat playerBasePhysic = new PhysicalStat(3, 3, 3, 3);
        Boots boots = new Boots(
                "Mercurial",
                120,
                new PhysicalStat(0,10,8,0),
                85,
                7
        );
        Outfit outfit = new Outfit(boots);
        Player player = new Player("User", 100, 0, new RoleStat(), playerBasePhysic, outfit);
        PhysicalStat expected = new PhysicalStat(0,8,6,0);
        PhysicalStat actual = player.getPhysicalBonus();
        assertEquals(expected,actual);
    }
}