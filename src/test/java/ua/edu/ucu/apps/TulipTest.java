package ua.edu.ucu.apps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TulipTest {
    private Tulip tulip;

    @BeforeEach
    public void setUp() {
        tulip = new Tulip();
    }

    @Test
    public void testTulipProperties() {
        Assertions.assertEquals(FlowerColor.YELLOW.getCode(), tulip.getColor());
        Assertions.assertEquals(FlowerType.TULIP, tulip.getFlowerType());
        Assertions.assertEquals(20, tulip.getPrice());
        Assertions.assertEquals(1.0, tulip.getSepalLengh());
    }
}