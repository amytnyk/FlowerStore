package com.alexm.flowerstorecontinue.controllers;

import com.alexm.flowerstorecontinue.items.flowers.Chamomile;
import com.alexm.flowerstorecontinue.items.flowers.Flower;
import com.alexm.flowerstorecontinue.items.flowers.Rose;
import com.alexm.flowerstorecontinue.items.flowers.Tulip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "api/flowers")
@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Rose(), new Chamomile(), new Tulip());
    }
}
