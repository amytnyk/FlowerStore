package com.alexm.flowerstorecontinue.items.decorators;

import com.alexm.flowerstorecontinue.items.ItemDecorator;

public class PaperDecorator extends ItemDecorator {
    @Override
    public String getDescription() {
        return "Flowers decorated by paper";
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}