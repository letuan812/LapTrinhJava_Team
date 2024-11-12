package nlhdang.exercise1;

public interface EmployeeManagement {
    void addEmployee(Employee employee);
    void updateEmployee(int id);
    void deleteEmployee(int id);
    void searchEmployee(String name);
    void sortEmployeesBySalary();
    void displayEmployees();
}
