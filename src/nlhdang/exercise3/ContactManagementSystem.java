package nlhdang.exercise3;

import java.util.Scanner;

import static nlhdang.exercise3.ContactManager.*;

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        boolean exit = false;

        while (!exit) {
            // Hiển thị menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm một liên hệ");
            System.out.println("2. Hiển thị tất cả các liên hệ");
            System.out.println("3. Xóa một liên hệ");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng còn lại

            switch (choice) {
                case 1:
                    addContact(scanner, contactManager);
                    break;
                case 2:
                    contactManager.displayAll();
                    break;
                case 3:
                    deleteContact(scanner, contactManager);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ.");
            }
        }

        System.out.println("Chương trình kết thúc.");
        scanner.close();
    }

    public static void addContact(Scanner scanner, ContactManager contactManager) {
        System.out.print("Nhập tên đầy đủ: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhập nhóm: ");
        String group = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();

        contactManager.addContact(fullName, group, address, phone);
    }

    public static void deleteContact(Scanner scanner, ContactManager contactManager) {
        System.out.print("Nhập ID của liên hệ cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        contactManager.deleteContact(id);
    }
}
