package com.cbi.footballPOC.model.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhysicalStatTest {

    @Test
    void add() {
        PhysicalStat baseStats = new PhysicalStat(3, 3, 3, 3);
        PhysicalStat bonusStats = new PhysicalStat(2, 2, 2, 2);

        PhysicalStat actual = baseStats.add(bonusStats);
        PhysicalStat expected = new PhysicalStat(5, 5, 5, 5);
        assertEquals(expected,actual);
    }
}