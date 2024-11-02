package LeTuan.Buoi2.QLNS;

public class Developer extends Employee {
//    Tạo lớp Developer kế thừa từ Employee:
//    Thuộc tính: programmingLanguage (ngôn ngữ lập trình).
//    Phương thức: displayInfo() (ghi đè phương thức từ lớp Employee để hiển thị
//    thêm thông tin ngôn ngữ lập trình).

    String programmingLanguage;

    public Developer(String id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Ngon ngu lap trinh: " + programmingLanguage);
    }
}
