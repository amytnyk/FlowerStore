package com.alexm.flowerstorecontinue.items;

import com.alexm.flowerstorecontinue.items.flowers.Flower;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;

    FlowerPack(Flower flower) {
        this(flower, 1);
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}

