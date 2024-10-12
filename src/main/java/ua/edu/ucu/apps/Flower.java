package ua.edu.ucu.apps;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Flower {

    private FlowerColor color;
    // private FlowerType flowerType;
    private double price;
    private double sepalLengh;

    public Flower(Flower flower) {
        this.color = flower.color;
        // this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLengh = flower.sepalLengh;
    }

    public String getColor() {
        return color.getCode();
    }
}
