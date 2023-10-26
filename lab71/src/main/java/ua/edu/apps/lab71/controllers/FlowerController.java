package ua.edu.apps.lab71.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.apps.lab71.item.Flower;
import ua.edu.apps.lab71.item.FlowerColor;
import ua.edu.apps.lab71.item.Rose;

@RestController
public class FlowerController {
    @GetMapping("/api/")
	public Flower hello(){
		Rose a = new Rose(FlowerColor.BLUE, 10, 10);
		return a;
	}
}
