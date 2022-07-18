package ss12_java_collection_framework.exercise.arraylist_linkedlist.service;

public interface IProductManager {
    void addProduct();

    void updateProduct(int productID);

    void removeProduct();

    void displayAllProduct();

    void searchProduct(String productName);

    void sort();
}
