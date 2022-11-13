package com.alexm.flowerstorecontinue.item.decorator;

import com.alexm.flowerstorecontinue.item.Item;
import com.alexm.flowerstorecontinue.item.ItemDecorator;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Flowers decorated by ribbon";
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }
}