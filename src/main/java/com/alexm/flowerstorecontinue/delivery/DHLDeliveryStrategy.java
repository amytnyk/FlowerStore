package com.alexm.flowerstorecontinue.delivery;

import com.alexm.flowerstorecontinue.item.Item;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.util.List;

@AllArgsConstructor
public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        // Some delivering process
    }

    @Override
    public String toString() {
        return "DHLDeliveryStrategy";
    }
}
