package Buoi2.QLSP;

public class PerishableProduct extends Product {
    String expiryDate;

    public PerishableProduct(String id, String name, double price, int quantity, String expiryDate) {
        super(id, name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ngay het han: " + expiryDate);
    }
}
