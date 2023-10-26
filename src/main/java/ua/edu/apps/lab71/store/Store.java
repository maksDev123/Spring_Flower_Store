package ua.edu.apps.lab71.store;

import java.util.ArrayList;
import java.util.List;

import ua.edu.apps.lab71.filter.SearchFilter;

public class Store {
    private List<Item> items;

    public Store(List<Item> items) {
        this.items = items;
    }

    public List<Item> searchItems(SearchFilter searchFilter) {
        List<Item> searchItems = new ArrayList<Item>();
        for (Item item : this.items) {
            if (searchFilter.match(item)) {
                searchItems.add(item);
            }
        }
        return searchItems;
    }
}
