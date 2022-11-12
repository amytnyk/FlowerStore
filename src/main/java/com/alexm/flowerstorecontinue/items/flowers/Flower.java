package com.alexm.flowerstorecontinue.items.flowers;

import com.alexm.flowerstorecontinue.items.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private double price;
}
