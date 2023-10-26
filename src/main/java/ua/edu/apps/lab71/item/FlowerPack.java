package ua.edu.apps.lab71.item;

import lombok.Getter;
import lombok.Setter;
import ua.edu.apps.lab71.store.Item;

@Getter
@Setter
public class FlowerPack extends Item {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.quantity = quantity;
        this.flower = new Flower(flower);
    }

    public double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }
}
