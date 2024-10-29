package Buoi2.QLSP;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Product> products = new ArrayList<>();

    public Inventory(List<Product> products) {
        this.products = products;
    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayInfo();
            System.out.println();
        }
    }
}
