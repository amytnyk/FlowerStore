package com.alexm.flowerstorecontinue.item.decorator;

import com.alexm.flowerstorecontinue.item.Item;
import com.alexm.flowerstorecontinue.item.ItemDecorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return "Flowers decorated by paper";
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}