package ua.edu.apps.lab71.filter;

import ua.edu.apps.lab71.store.Item;

public interface SearchFilter {
    boolean match(Item item);
}
