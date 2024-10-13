package ua.edu.ucu.apps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerPackTest {

    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower(FlowerColor.RED, FlowerType.ROSE, 10.0, 5.0);
        flowerPack = new FlowerPack(flower, 3);
    }

    @Test
    public void testGetPrice() {
        double expectedPrice = flower.getPrice() * flowerPack.getAmount();
        Assertions.assertEquals(expectedPrice, flowerPack.getPrice());
    }
}
