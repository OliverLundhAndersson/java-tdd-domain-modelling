package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    public HashMap<String, Integer> items;

    public Basket() {
        this.items = new HashMap<>();
    }

    public boolean add(String name, int price) {
        if (this.items.containsKey(name)) {
            return false;
        }
        this.items.put(name, price);
        return true;
    }

    public int total() {
        int total = 0;
        for (int itemPrice : this.items.values()) {
            total += itemPrice;
        }
        return total;
    }
}
