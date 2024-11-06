package LeTuan.Exercise.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<NhanVien> nhanVienList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bai tap 1.\n https://github.com/letuan812/LapTrinhJava_Team/tree/276c556f8c8c30572ba8e61802750e3e20d70dc2/src/Exercise");
        // MainMenu();
        // ChonChucNang();
        NhanVien nv;
//        nv = ThemNhanVien();
//        nv = ThemNhanVien();
//        nv = ThemNhanVien();
//        nv = ThemNhanVien();
//        nv = ThemNhanVien();
        nhanVienList.add(ThemNhanVien());
        nhanVienList.add(ThemNhanVien());
        nhanVienList.add(ThemNhanVien());
        nhanVienList.add(ThemNhanVien());
        nhanVienList.add(ThemNhanVien());
        nhanVienList.add(ThemNhanVien());

        InDSNhanVien(nhanVienList);


    }

    public static void MainMenu() {
        System.out.println("Menu chính");
        System.out.println("1.Thêm nhân viên \n2.Cập nhật nhân viên \n3.Xóa nhân viên \n4.Tìm kiếm nhân viên \n5.Sắp xếp nhân viên theo lương \n6.Thoát");
    }

    public static void ChonChucNang() {
        MainMenu();
        Scanner scanner = new Scanner(System.in);
        int selectMenu;


        System.out.print("Vui long chon chuc nang de thuc hien: ");
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

    public static NhanVien ThemNhanVien() {
        NhanVien nhanVien = new NhanVien();

        nhanVien.setId("01");
        nhanVien.setHo("Lê Anh ");
        nhanVien.setTen("Tuấn");
        nhanVien.setNgaySinh("18/12");
        nhanVien.setGioiTinh("Nam");
        nhanVien.setDiaChi("Phường 6, TPCL");
        nhanVien.setEmail("letuan@dthu.edu.vn");
        nhanVien.setSoDienThoai("0914555875");
        nhanVien.setPhongBan("Đào tạo");
        nhanVien.setLuong(20000);


//        nhanVien.setId("01");
//        nhanVien.setHo("Lê Anh ");
//        nhanVien.setTen("Tuấn");
//        nhanVien.setNgaySinh("Ngày Sinh");
//        nhanVien.setGioiTinh("Giới tính");
//        nhanVien.setDiaChi("Địa chỉ);
//        nhanVien.setEmail("Email");
//        nhanVien.setSoDienThoai("Số ĐT");
//        nhanVien.setPhongBan("Phòng ban");
//        nhanVien.setLuong("Lương");
        // nhanVien.HienThiThongTin("1" = "1");
        //  nhanVien.HienThiThongTin();

        return nhanVien;

    }

    public static void InDSNhanVien(List<NhanVien> nvList) {
        nvList.get(0).HienThiThongTinTieuDe();
        for (NhanVien nv : nvList) {
            nv.HienThiThongTin();
        }

    }
}
