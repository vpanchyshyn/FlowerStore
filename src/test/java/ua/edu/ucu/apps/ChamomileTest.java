package ua.edu.ucu.apps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChamomileTest {
    private Chamomile chamomile;

    @BeforeEach
    public void setUp() {
        chamomile = new Chamomile();
    }

    @Test
    public void testChamomileProperties() {
        Assertions.assertEquals(FlowerColor.WHITE.getCode(), chamomile.getColor());
        Assertions.assertEquals(FlowerType.CHAMOMILE, chamomile.getFlowerType());
        Assertions.assertEquals(10, chamomile.getPrice());
        Assertions.assertEquals(5.0, chamomile.getSepalLengh());
    }
}
