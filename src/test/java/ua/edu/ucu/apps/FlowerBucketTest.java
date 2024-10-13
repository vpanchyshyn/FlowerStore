package ua.edu.ucu.apps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    private Flower flower1;
    private Flower flower2;
    private FlowerPack flowerPack1;
    private FlowerPack flowerPack2;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
        flower1 = new Flower(FlowerColor.RED, FlowerType.ROSE, 30.0, 10.0);
        flower2 = new Flower(FlowerColor.YELLOW, FlowerType.TULIP, 20.0, 1);
        flowerPack1 = new FlowerPack(flower1, 3);
        flowerPack2 = new FlowerPack(flower2, 2);
    }

    @Test
    public void testAddFlowerPack() {
        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);
        Assertions.assertEquals(2, flowerBucket.getFlowerPacks().size());
    }

    @Test
    public void testGetPrice() {
        flowerBucket.add(flowerPack1);
        flowerBucket.add(flowerPack2);
        double expectedPrice = (30.0 * 3) + (20.0 * 2);
        Assertions.assertEquals(expectedPrice, flowerBucket.getPrice());
    }

    @Test
    public void testEmptyBucketPrice() {
        Assertions.assertEquals(0.0, flowerBucket.getPrice());
    }
}
