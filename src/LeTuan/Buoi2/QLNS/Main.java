package Buoi2.QLNS;

public class Main {
    public static void main(String[] args) {
        HR hr = new HR();
        Manager manager = new Manager("M01", "Le Anh", 1000, "Officer");
        Developer developer = new Developer("D01", "Le Tuan", 2000, "Java");
        hr.addEmployee(manager);
        hr.addEmployee(developer);
        hr.displayAllEmployees();

    }
}
