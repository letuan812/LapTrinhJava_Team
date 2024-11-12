package nlhdang.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class EmployeeManager implements EmployeeManagement {

    private List<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void addEmployee(Employee employee) {
        for (Employee emp : employees) {
            if (emp.getId() == employee.getId()) {
                System.out.println("Error: ID already exists.");
                return;
            }
        }
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    @Override
    public void updateEmployee(int id) {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }
        System.out.println("Updating employee details...");
        System.out.print("Enter new First Name: ");
        employee.setFirstName(scanner.next());
        System.out.print("Enter new Last Name: ");
        employee.setLastName(scanner.next());
        System.out.print("Enter new Phone Number: ");
        employee.setPhoneNumber(scanner.next());
        System.out.print("Enter new Email: ");
        employee.setEmail(scanner.next());
        System.out.print("Enter new Address: ");
        employee.setAddress(scanner.next());
        System.out.print("Enter new Birth Date: ");
        employee.setBirthDate(scanner.next());
        System.out.print("Enter new Gender: ");
        employee.setGender(scanner.next());
        System.out.print("Enter new Salary: ");
        employee.setSalary(scanner.nextDouble());
        System.out.print("Enter new Department: ");
        employee.setDepartment(scanner.next());
        System.out.println("Employee updated successfully.");
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    @Override
    public void searchEmployee(String name) {
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getFirstName().contains(name) || employee.getLastName().contains(name)) {
                System.out.println(employee);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with the name: " + name);
        }
    }

    @Override
    public void sortEmployeesBySalary() {
        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employees sorted by salary (ascending).");
        displayEmployees();
    }

    @Override
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Sort Employees by Salary");
            System.out.println("6. Display All Employees");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee Details:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    System.out.print("First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Last Name: ");
                    String lastName = scanner.next();
                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.next();
                    System.out.print("Email: ");
                    String email = scanner.next();
                    System.out.print("Address: ");
                    String address = scanner.next();
                    System.out.print("Birth Date: ");
                    String birthDate = scanner.next();
                    System.out.print("Gender: ");
                    String gender = scanner.next();
                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Department: ");
                    String department = scanner.next();
                    addEmployee(new Employee(id, firstName, lastName, phoneNumber, email, address, birthDate, gender, salary, department));
                    break;
                case 2:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = scanner.nextInt();
                    updateEmployee(updateId);
                    break;
                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteEmployee(deleteId);
                    break;
                case 4:
                    System.out.print("Enter name or part of name to search: ");
                    String searchName = scanner.next();
                    searchEmployee(searchName);
                    break;
                case 5:
                    sortEmployeesBySalary();
                    break;
                case 6:
                    displayEmployees();
                    break;
                case 7:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}