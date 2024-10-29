package Buoi2.QLNS;

public class Employee {
//    Thuộc tính: id (mã nhân viên), name (tên nhân viên), salary (lương).
//    Phương thức: displayInfo() (hiển thị thông tin nhân viên).

    String id;
    String name;
    double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Ma nhan vien: " + id);
        System.out.println("Ho ten nhan vien: " + name);
        System.out.println("Luong nhan vien: " + salary);
    }

}
