package com.alexm.flowerstorecontinue.items.decorators;

import com.alexm.flowerstorecontinue.items.ItemDecorator;

public class BasketDecorator extends ItemDecorator {
    @Override
    public String getDescription() {
        return "Flowers decorated by basket";
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}
