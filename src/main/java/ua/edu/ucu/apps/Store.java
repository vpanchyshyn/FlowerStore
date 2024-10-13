package ua.edu.ucu.apps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {
    private List<Flower> flowers;

    public Store() {
        flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> search(Flower searchFlower) {
        List<Flower> matchingFlowers = new LinkedList<>();

        for (Flower flower : flowers) {
            if (searchFlower.getFlowerType() != null && !searchFlower.getFlowerType().equals(flower.getFlowerType())) {
                continue;
            }
            if (searchFlower.getColor() != null && !searchFlower.getColor().equals(flower.getColor())) {
                continue;
            }
            if (searchFlower.getSepalLengh() > 0 && searchFlower.getSepalLengh() != flower.getSepalLengh()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        
        return matchingFlowers;
    }
}
