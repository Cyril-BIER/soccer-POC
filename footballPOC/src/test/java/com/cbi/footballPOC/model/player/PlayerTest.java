package com.cbi.footballPOC.model.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getTotalPhysic() {
        PhysicalStat playerBasePhysic = new PhysicalStat(3, 3, 3, 3);
        PhysicalStat playerBonusPhysic = new PhysicalStat(2, 2, 2, 2);
        Player player = new Player("User", 100, 0, new RoleStat(), playerBasePhysic, playerBonusPhysic);

        PhysicalStat actual = player.getTotalPhysic();
        PhysicalStat expected = new PhysicalStat(5, 5, 5, 5);
        assertEquals(expected, actual);
    }
}