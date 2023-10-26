package ua.edu.apps.lab71.delivery;

import java.util.List;

import ua.edu.apps.lab71.store.Item;

public class DHLDeliveryStrategy implements Delivery {

    @Override
    public void delivery(List<Item> items) {
        System.out.println("Delivering Items DHL");
    }
    
}   
