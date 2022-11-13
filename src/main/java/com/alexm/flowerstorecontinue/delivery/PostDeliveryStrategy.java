package com.alexm.flowerstorecontinue.delivery;

import com.alexm.flowerstorecontinue.item.Item;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        // Some delivering process
    }

    @Override
    public String toString() {
        return "PostDeliveryStrategy";
    }
}
