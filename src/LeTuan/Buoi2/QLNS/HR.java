package Buoi2.QLNS;

import java.util.ArrayList;
import java.util.List;

public class HR {
//    Tạo lớp HR:
//    Thuộc tính: employees (danh sách các nhân viên).
//    Phương thức: addEmployee(Employee employee) (thêm nhân viên vào danh sách),
//    displayAllEmployees() (hiển thị thông tin tất cả nhân viên).

    List<Employee> employeeList = new ArrayList<>();

    public HR() {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employeeList) {
            employee.displayInfo();
            System.out.println();
        }

    }
}
