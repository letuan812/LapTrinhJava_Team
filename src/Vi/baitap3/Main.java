package baitap3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContactManage contactManage = new ContactManage();
        Boolean exit = false;
        while (!exit){
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm một liên hệ");
            System.out.println("2. Hiển thị tất cả các liên hệ");
            System.out.println("3. Xóa một liên hệ");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng (1-4): ");
            int selectMenu = scanner.nextInt();
            scanner.nextLine();//bỏ bộ đệm
            switch (selectMenu){
                case 1:
                    System.out.println("1.Thêm liên hệ");
                    System.out.println("Nhập tên:");
                    String hoten = scanner.nextLine();
                    System.out.println("So dien thoai");
                    String sdt = scanner.nextLine();
                    System.out.println("Dia chi");
                    String diachi = scanner.nextLine();
                    System.out.println("Nhom:");
                    String nhom = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("2.Hiển thị tất cả các liên hệ");
                    contactManage.hienthithongtin();
                    System.out.println("**********************");
                    break;
                case 3:
                    System.out.println("3. Xóa một liên hệ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    contactManage.deleteContact(id);
                    break;
                case 4:
                    System.out.println("4.Thoat");
                    exit = true;
                    break;
                case 5:
                    System.out.println("5.Sắp xếp nhân viên theo lương");
                    break;
                case 6:
                    System.out.println("6.Thoát");
                    break;


            }
        }
    }
}