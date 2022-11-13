package com.alexm.flowerstorecontinue.item.flower;

import com.alexm.flowerstorecontinue.item.Item;
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
