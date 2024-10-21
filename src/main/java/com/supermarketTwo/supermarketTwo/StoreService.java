package com.supermarketTwo.supermarketTwo;

import java.util.List;

public class StoreService {
    
    StoreRepository storeRepository = new StoreRepository();

    public Item getItem(int index) {
        return storeRepository.getItem(index);
    }

    public void addItem(Item item) {
        storeRepository.addItem(item);
    }

    public void updateItem(int index, Item item) {
        storeRepository.updateItem(index, item);
    }

    public List<Item> getItems() {
        return storeRepository.getItems();
    }

    public Item getItemfromId(String id) {
        int index = storeRepository.getItemIndexById(id);
        return index == Constants.NOT_FOUND ? new Item() : getItem(index);
    }

    public String handleSubmit(Item item) {
        return "Item submitted succesfully";
    }
}
