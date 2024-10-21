package com.supermarketTwo.supermarketTwo;
import java.util.ArrayList;
import java.util.List;


public class StoreRepository {
    
    private final List<Item> items = new ArrayList<>();

    public Item getItem(int index) {
        return items.get(index);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(int index, Item item) {
        items.set(index, item);
    }

    public List<Item> getItems() {
        return items;
    }

    public int getItemIndexById(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                return i;
            }
        }
        return Constants.NOT_FOUND;
    }
}
