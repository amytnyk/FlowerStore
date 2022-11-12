package com.alexm.flowerstorecontinue.items.decorators;

import com.alexm.flowerstorecontinue.items.ItemDecorator;

public class RibbonDecorator extends ItemDecorator {
    @Override
    public String getDescription() {
        return "Flowers decorated by ribbon";
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }
}