package ua.edu.ucu.apps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Store store;
    private Flower flower1;
    private Flower flower2;
    private Flower flower3;

    @BeforeEach
    public void init() {
        store = new Store();
        flower1 = new Flower(FlowerColor.RED, FlowerType.ROSE, 10.0, 5.0);
        flower2 = new Flower(FlowerColor.YELLOW, FlowerType.TULIP, 15.0, 4.5);
        flower3 = new Flower(FlowerColor.RED, FlowerType.TULIP, 12.0, 5.0);
        store.addFlower(flower1);
        store.addFlower(flower2);
        store.addFlower(flower3);
    }

    @Test
    public void testAddFlower() {
        Assertions.assertEquals(3, store.getFlowers().size());
    }

    @Test
    public void testSearch() {
        Flower searchFlower = new Flower();
        searchFlower.setColor(FlowerColor.RED);
        searchFlower.setFlowerType(FlowerType.TULIP);
        List<Flower> result = store.search(searchFlower);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(flower3, result.get(0));
    }
}
