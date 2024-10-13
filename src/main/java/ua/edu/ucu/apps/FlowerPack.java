package ua.edu.ucu.apps;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class FlowerPack {

    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int count) {
        this.flower = new Flower(flower);
        this.amount = count;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
