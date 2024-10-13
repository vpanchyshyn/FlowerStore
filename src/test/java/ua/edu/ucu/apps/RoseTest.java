package ua.edu.ucu.apps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoseTest {
    private Rose rose;

    @BeforeEach
    public void setUp() {
        rose = new Rose();
    }

    @Test
    public void testRoseProperties() {
        Assertions.assertEquals(FlowerColor.RED.getCode(), rose.getColor());
        Assertions.assertEquals(FlowerType.ROSE, rose.getFlowerType());
        Assertions.assertEquals(30, rose.getPrice());
        Assertions.assertEquals(10.0, rose.getSepalLengh());
    }
}