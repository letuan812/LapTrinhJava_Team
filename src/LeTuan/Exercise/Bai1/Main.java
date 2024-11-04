package LeTuan.Exercise.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bai tap 1.\n https://github.com/letuan812/LapTrinhJava_Team/tree/276c556f8c8c30572ba8e61802750e3e20d70dc2/src/Exercise");
        // MainMenu();
        ChonChucNang();

    }

    public static void MainMenu() {
        System.out.println("Menu chính");
        System.out.println("1.Thêm nhân viên \n2.Cập nhật nhân viên \n3.Xóa nhân viên \n4.Tìm kiếm nhân viên \n5.Sắp xếp nhân viên theo lương \n6.Thoát");
    }

    public static void ChonChucNang() {
        MainMenu();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui long chon chuc nang de thuc hien: ");

        int selectMenu;
        selectMenu = scanner.nextInt();

        while (selectMenu < 1 || selectMenu > 6) {
            System.out.println("Vui long chon lai chuc nang: ");
            selectMenu = scanner.nextInt();
        }
        
        switch (selectMenu) {
            case 1:
                System.out.println("1.Thêm nhân viên");
                break;
            case 2:
                System.out.println("2.Cập nhật nhân viên");
                break;
            case 3:
                System.out.println("3.Xóa nhân viên");
                break;
            case 4:
                System.out.println("4.Tìm kiếm nhân viên");
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
