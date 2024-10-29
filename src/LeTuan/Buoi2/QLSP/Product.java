package Buoi2.QLSP;

public class Product {

    String id;
    String name;
    double price;
    int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Ma san pham: " + id + "Ten san pham: "
                + name + " Gia SP: " + price + "So luong: " + quantity);
    }
}
