package LeTuan.Buoi3.BaiTapTongHop1;

public class Main {
    public static void main(String[] args) {
        TestInfo();
        System.out.println("Khởi tạo các doi tuong va dat gia tri ban dau ");
        Shape circle = new Circle(15);
        Shape rectangle = new Rectangle(20, 10);
        Shape triangle = new Triangle(10, 7);


    }

    private static void TestInfo() {
        System.out.println("LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG\nXÂY DỰNG ỨNG DỤNG TÍNH DIỆN TÍCH HÌNH HỌC");
        System.out.println("1.	Thiết kế lớp trừu tượng (abstract class) Shape:" +
                "\n\t o	Thuộc tính: name (tên của hình)" +
                "\n\t o	Phương thức trừu tượng: calculateArea() và calculatePerimeter()" +
                "\n2.	Tạo các lớp con kế thừa từ Shape:" +
                "\n\to	Circle với thuộc tính radius (bán kính)" +
                "\n\to	Rectangle với thuộc tính width (chiều rộng) và height (chiều cao)" +
                "\n\to	Triangle với thuộc tính base (đáy) và height (chiều cao)" +
                "\n3.	Sử dụng interface IShapeOperations để định nghĩa các phương thức:" +
                "\n\to	calculateArea()" +
                "\n\to	calculatePerimeter()" +
                "\n4.	Tổ chức lưu trữ các đối tượng Shape trong một List<Shape>." +
                "\n5.	Chuyển đổi dữ liệu của các đối tượng Shape sang định dạng XML và JSON để lưu trữ ra file." +
                "\n6.	Đọc dữ liệu từ file XML và JSON vào khi thực thi chương trình.");


    }
}
