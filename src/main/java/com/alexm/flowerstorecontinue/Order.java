package com.alexm.flowerstorecontinue;

import com.alexm.flowerstorecontinue.items.Item;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<Item> items = new ArrayList<>();
    @Setter
    public Payment payment;
    @Setter
    public Delivery delivery;

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        return ;
    }
}
