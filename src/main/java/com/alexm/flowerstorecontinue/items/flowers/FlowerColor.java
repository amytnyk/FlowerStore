package com.alexm.flowerstorecontinue.items.flowers;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    WHITE("#FFFFFF");
    private final String stringRepresentation;

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
