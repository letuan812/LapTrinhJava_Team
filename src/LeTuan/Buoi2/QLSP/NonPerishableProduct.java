package Buoi2.QLSP;

public class NonPerishableProduct extends Product {
    String warrantyPeriod;

    public NonPerishableProduct(String id, String name, double price, int quantity, String warrantyPeriod) {
        super(id, name, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thoi gian BH: " + warrantyPeriod);
    }
}
