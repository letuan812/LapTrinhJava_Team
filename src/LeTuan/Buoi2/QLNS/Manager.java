package LeTuan.Buoi2.QLNS;

public class Manager extends Employee {

//    Tạo lớp Manager kế thừa từ Employee:
//    Thuộc tính: department (phòng ban).
//    Phương thức: displayInfo() (ghi đè phương thức từ lớp Employee để hiển thị thêm thông tin phòng ban).

    String department;

    public Manager(String id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Phong ban: " + department);
    }
}
