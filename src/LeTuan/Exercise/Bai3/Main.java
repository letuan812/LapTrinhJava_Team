package LeTuan.Exercise.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bài 3. https://github.com/letuan812/LapTrinhJava_Team/tree/276c556f8c8c30572ba8e61802750e3e20d70dc2/src/Exercise");
        List<Contact> danhSach = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        ContactManage contactManage = new ContactManage();
        Boolean exit = false;
        while (!exit) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm một liên hệ");
            System.out.println("2. Hiển thị tất cả các liên hệ");
            System.out.println("3. Xóa một liên hệ");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng (1-4): ");

            int selectMenu = scanner.nextInt();
            scanner.nextLine();//Bỏ bộ đệm

            switch (selectMenu) {
                case 1:

                    System.out.println("1.Thêm liên hệ");
                    System.out.println("Nhập tên:");
                    String fullName = scanner.nextLine();
                    System.out.println("So dien thoai");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Dia chi");
                    String address = scanner.nextLine();
                    System.out.println("Nhom:");
                    String group = scanner.nextLine();

                    contactManage.addContact(fullName, phoneNumber, address, group);
                    danhSach.add(contactManage.addContact2(fullName, phoneNumber, address, group));

                    break;
                case 2:
                    System.out.println("2.Hiển thị tất cả các liên hệ");
                    contactManage.hienThiThongTin();
                    System.out.println("**********************");
                    contactManage.hienThiThongTin(danhSach);
                    break;
                case 3:
                    System.out.println("3. Xóa một liên hệ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    contactManage.deleteContact(id);
                    //qlNhanVien.HienThiNhanVien();
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
