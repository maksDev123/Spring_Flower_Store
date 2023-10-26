package ua.edu.apps.lab71.item_decorator;

import ua.edu.apps.lab71.store.Item;

public class BacketDecorator extends ItemDecorator{

    @Override
    public String getDescription(Item bucket) {
        return bucket.getPrice() + bucket.toString();
    }
    
}
