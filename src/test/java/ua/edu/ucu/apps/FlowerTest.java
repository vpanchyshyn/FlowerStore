package ua.edu.ucu.apps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }
    @Test
    public void testFlowerType() {
        FlowerType type = FlowerType.ROSE;
        flower.setFlowerType(type);
        Assertions.assertEquals(type, flower.getFlowerType());
    }

    @Test
    public void testSepalLength() {
        double length = 7.5;
        flower.setSepalLengh(length);
        Assertions.assertEquals(length, flower.getSepalLengh());
    }
    @Test
    public void testCopyConstructor() {
        flower.setColor(FlowerColor.YELLOW);
        flower.setFlowerType(FlowerType.TULIP);
        flower.setPrice(15.0);
        flower.setSepalLengh(5.5);

        Flower copiedFlower = new Flower(flower);
        Assertions.assertEquals(flower.getColor(), copiedFlower.getColor());
        Assertions.assertEquals(flower.getFlowerType(), copiedFlower.getFlowerType());
        Assertions.assertEquals(flower.getPrice(), copiedFlower.getPrice());
        Assertions.assertEquals(flower.getSepalLengh(), copiedFlower.getSepalLengh());
    }

}
