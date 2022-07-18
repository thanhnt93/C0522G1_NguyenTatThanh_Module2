package ss12_java_collection_framework.exercise.arraylist_linkedlist.service.impl;

import ss12_java_collection_framework.exercise.arraylist_linkedlist.model.Product;

import java.util.Comparator;

public class ComparatorDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}