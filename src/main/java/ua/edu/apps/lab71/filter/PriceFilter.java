package ua.edu.apps.lab71.filter;

import ua.edu.apps.lab71.store.Item;

public class PriceFilter implements SearchFilter {
    private float maxPrice;
    public PriceFilter(float maxPrice) {
        this.maxPrice = maxPrice;
    }
    @Override
    public boolean match(Item item) {
        return item.getPrice() < maxPrice;
    }
}
