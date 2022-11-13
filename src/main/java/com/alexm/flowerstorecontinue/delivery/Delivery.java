package com.alexm.flowerstorecontinue.delivery;

import com.alexm.flowerstorecontinue.item.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
