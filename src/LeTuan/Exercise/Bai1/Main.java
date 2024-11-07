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
        nhanVienList.add(KhoiTaoDSNhanVien());
        nhanVienList.add(KhoiTaoDSNhanVien());
        nhanVienList.add(KhoiTaoDSNhanVien("002"));
        nhanVienList.add(KhoiTaoDSNhanVien("003"));
        nhanVienList.add(KhoiTaoDSNhanVien("004"));
        nhanVienList.add(KhoiTaoDSNhanVien("005"));

        nv = ThemNhanVien();

        System.out.println();

        //Khong kiem duoc trong truong hop nhap ma trung &&&&&&&&&&&&&&&&&&&

        while (!chkNhanVienMoiID(nhanVienList, nv.getId())) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ma nhan vien bi trung. Nhap lai ma nhan vien:");
            nv.setId(scanner.nextLine());
        }

        nhanVienList.add(nv);

        InDSNhanVien(nhanVienList);
        System.out.println("Cau 4. Tim kiem nhan vien");
        TimKiemNhanVien_Cau4(nhanVienList);


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

    public static NhanVien KhoiTaoDSNhanVien() {
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

    public static NhanVien KhoiTaoDSNhanVien(String id) {
        NhanVien nhanVien = new NhanVien();

        nhanVien.setId(id);
        nhanVien.setHo("Lê Anh ");
        nhanVien.setTen("Tuấn");
        nhanVien.setNgaySinh("18/12");
        nhanVien.setGioiTinh("Nam");
        nhanVien.setDiaChi("Phường 6, TPCL");
        nhanVien.setEmail("letuan@dthu.edu.vn");
        nhanVien.setSoDienThoai("0914555875");
        nhanVien.setPhongBan("Đào tạo");
        nhanVien.setLuong(20000);
        return nhanVien;
    }

    public static NhanVien ThemNhanVien() {
        NhanVien nv = new NhanVien();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã NV");
        nv.setId(scanner.nextLine());

        System.out.print("Họ");
        nv.setHo(scanner.nextLine());
        System.out.print("Tên");
        nv.setTen(scanner.nextLine());
        System.out.print("Ngay Sinh");
        nv.setNgaySinh(scanner.nextLine());
        System.out.print("Gioi tinh");
        nv.setGioiTinh(scanner.nextLine());
        System.out.print("Dia chi");
        nv.setDiaChi(scanner.nextLine());
        System.out.print("Email");
        nv.setEmail(scanner.nextLine());
        System.out.print("So DT");
        nv.setSoDienThoai(scanner.nextLine());
        System.out.print("Phong Ban");
        nv.setPhongBan(scanner.nextLine());
        System.out.print("Luong");
        nv.setLuong(scanner.nextInt());

        return nv;
    }

    public static CapNhatNhanVien ThemNhanVien(List<NhanVien> nhanVienList1, int index ) {
        NhanVien nv = new NhanVien();

        nv = nhanVienList1.(index);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã NV");
        nv.setId(scanner.nextLine());

        System.out.print("Họ");
        nv.setHo(scanner.nextLine());
        System.out.print("Tên");
        nv.setTen(scanner.nextLine());
        System.out.print("Ngay Sinh");
        nv.setNgaySinh(scanner.nextLine());
        System.out.print("Gioi tinh");
        nv.setGioiTinh(scanner.nextLine());
        System.out.print("Dia chi");
        nv.setDiaChi(scanner.nextLine());
        System.out.print("Email");
        nv.setEmail(scanner.nextLine());
        System.out.print("So DT");
        nv.setSoDienThoai(scanner.nextLine());
        System.out.print("Phong Ban");
        nv.setPhongBan(scanner.nextLine());
        System.out.print("Luong");
        nv.setLuong(scanner.nextInt());

        return nv;
    }

    public static void InDSNhanVien(List<NhanVien> nvList) {
        nvList.get(0).HienThiThongTinTieuDe();
        for (NhanVien nv : nvList) {
            nv.HienThiThongTin();
        }

    }

    public static boolean chkNhanVienMoiID(List<NhanVien> nhanVienList, String id) {

        for (NhanVien nhanVien : nhanVienList) {
            if (nhanVien.getId().equals(id)) return false;
        }
        return true;
    }

    public static int findNhanVien(List<NhanVien> nhanVienList, String id) {
        //Tim va tra ve vi tri trong danh sach
        int i = 0;

        for (NhanVien nhanVien : nhanVienList) {
            if (nhanVien.getId().equals(id)) return i;
            i++;
        }

        System.out.println();
        return -1;
    }

    public static void TimKiemNhanVien_Cau4(List<NhanVien> nhanVienList) {
        NhanVien nhanVien;
        List<NhanVien> nhanVienList1 = new ArrayList<>();
        int indexNV;
        Scanner scanner = new Scanner(System.in);
        System.out.println("TIM KIEM NHAN VIEN THEO MA SO");
        System.out.println("Nhap ma so nhan vien can tim: ");
        String stId;

        stId = scanner.nextLine();

        indexNV = findNhanVien(nhanVienList, stId);
        if (indexNV < 0) {
            System.out.printf("Khong tim thay ma nhan vien %s.", stId);
        } else {
            nhanVienList1.add(nhanVienList.get(indexNV));
            //nhanVienList1.get(0).HienThiThongTinTieuDe();
            InDSNhanVien(nhanVienList1);

        }
    }
}
