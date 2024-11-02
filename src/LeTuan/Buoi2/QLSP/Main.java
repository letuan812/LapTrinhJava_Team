package LeTuan.Buoi2.QLSP;

import java.util.ArrayList;

public class Main {


//
//    Đề bài:
//    Tạo lớp Product:
//    >>Thuộc tính: id (mã sản phẩm), name (tên sản phẩm), price (giá), quantity (số lượng).
//    Phương thức: displayInfo() (hiển thị thông tin sản phẩm).
//    >>Tạo lớp PerishableProduct kế thừa từ Product:
//    Thuộc tính: expiryDate (ngày hết hạn).
//    Phương thức: displayInfo() (ghi đè phương thức từ lớp Product
//    để hiển thị thêm thông tin ngày hết hạn).
//    Tạo lớp NonPerishableProduct kế thừa từ Product:
//    Thuộc tính: warrantyPeriod (thời gian bảo hành).
//    Phương thức: displayInfo() (ghi đè phương thức từ lớp Product
//    để hiển thị thêm thông tin thời gian bảo hành).
//    Tạo lớp Inventory:
//    Thuộc tính: products (danh sách các sản phẩm).
//    Phương thức: addProduct(Product product) (thêm sản phẩm vào danh sách),
//    removeProduct(int id) (xóa sản phẩm theo mã),
//    displayAllProducts() (hiển thị thông tin tất cả sản phẩm).
//


    public static void main(String[] agrs) {
        Inventory inventory = new Inventory(new ArrayList<>());
        PerishableProduct perishableProduct = new PerishableProduct("01", "iPhone16", 350, 10, "01-10-2026");
        NonPerishableProduct nonPerishableProduct = new NonPerishableProduct("01", "iPhone16", 350, 3, "10-10-2025");
        inventory.addProduct(perishableProduct);
        inventory.addProduct(nonPerishableProduct);
        inventory.displayAllProducts();
    }
}
