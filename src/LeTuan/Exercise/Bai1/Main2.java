package LeTuan.Exercise.Bai1;

import LeTuan.Exercise.Bai1.model.NhanVien;
import LeTuan.Exercise.Bai1.service.QLNhanVien;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //1. Memu


        //2. Người dùng chọn memu

        Scanner scanner = new Scanner(System.in);
        QLNhanVien qlNhanVien = new QLNhanVien();

        while (true) {

            System.out.println("Menu chính");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Cập nhật nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Tìm kiếm nhân viên");
            System.out.println("5. Sắp xếp nhân viên theo lương");
            System.out.println("6. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            System.out.println("Vui long chon chuc nang: ");

            int selectMenu = scanner.nextInt();
            scanner.nextLine();//Bỏ bộ đệm

            switch (selectMenu) {
                case 1:
                    System.out.println("1.Thêm nhân viên");
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
                    qlNhanVien.ThemNhanVien(nhanVien);
                    qlNhanVien.HienThiNhanVien();
                    break;
                case 2:
                    System.out.println("2.Cập nhật nhân viên");
                    break;
                case 3:
                    System.out.println("3.Xóa nhân viên");
                    String id = scanner.nextLine();
                    qlNhanVien.XoaNhanVien(id);
                    //qlNhanVien.HienThiNhanVien();
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


}
