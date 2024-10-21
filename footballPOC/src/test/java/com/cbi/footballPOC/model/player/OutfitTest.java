package com.cbi.footballPOC.model.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutfitTest {

    @Test
    void getBonus() {
        Boots boots = new Boots(
                "Mercurial",
                120,
                new PhysicalStat(0,10,8,0),
                85,
                7
        );
        Outfit outfit = new Outfit(boots);

        PhysicalStat expected = new PhysicalStat(0,8,6,0);
        PhysicalStat actual = outfit.getBonus();

        assertEquals(expected,actual);

    }
}