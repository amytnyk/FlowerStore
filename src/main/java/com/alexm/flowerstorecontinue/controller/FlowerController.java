package com.alexm.flowerstorecontinue.controller;

import com.alexm.flowerstorecontinue.item.flower.Chamomile;
import com.alexm.flowerstorecontinue.item.flower.Flower;
import com.alexm.flowerstorecontinue.item.flower.Rose;
import com.alexm.flowerstorecontinue.item.flower.Tulip;
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
