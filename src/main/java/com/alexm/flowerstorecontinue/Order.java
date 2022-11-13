package com.alexm.flowerstorecontinue;

import com.alexm.flowerstorecontinue.delivery.Delivery;
import com.alexm.flowerstorecontinue.item.Item;
import com.alexm.flowerstorecontinue.payment.Payment;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items = new ArrayList<>();
    @Setter
    public Payment payment;
    @Setter
    public Delivery delivery;

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        if (payment.pay(calculateTotalPrice()))
            delivery.deliver(items);
    }
}
