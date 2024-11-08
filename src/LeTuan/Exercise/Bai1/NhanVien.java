package LeTuan.Exercise.Bai1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NhanVien {
    private String id;
    private String ten;
    private String ho;
    private String soDienThoai;
    private String email;
    private String diaChi;
    private String ngaySinh;
    private String gioiTinh;
    private String phongBan;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String id, String ten, String ho, String soDienThoai, String email,
                    String diaChi, String ngaySinh, String gioiTinh, String phongBan, double luong) {
        setId(id);
        setTen(ten);
        setHo(ho);
        setSoDienThoai(soDienThoai);
        setEmail(email);
        setDiaChi(diaChi);
        setNgaySinh(ngaySinh);
        setGioiTinh(gioiTinh);
        setPhongBan(phongBan);
        setLuong(luong);


        //        this.id = id;
//        this.ten = ten;
//        this.ho = ho;
//        this.soDienThoai = soDienThoai;
//        this.email = email;
//        this.diaChi = diaChi;
//        this.ngaySinh = ngaySinh;
//        this.gioiTinh = gioiTinh;
//        this.phongBan = phongBan;
//        this.luong = luong;
    }

    public static void printCentered(String text, int width) {
        int padding = (width - text.length()) / 2;
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(text);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        if (text.length() % 2 != 0) {
            System.out.print(" ");
        }
    }


    private static void fnMenu() {
        System.out.println("CHUC NANG CAP NHAT THONG TIN NHAN VIEN");
        System.out.println(" 1.Mã NV\n" +
                " 2.Họ và Tên\n" +
                " 3.Ngay Sinh\n" +
                " 4.Gioi tinh\n" +
                " 5.Dia chi\n" +
                " 6.Email\n" +
                " 7.So DT\n" +
                " 8.Phong Ban\n" +
                " 9.Luong \n" +
                "#. Kết thúc");
    }

    public String printCentered2(String text, int width) {
        int padding = (width - text.length()) / 2;
        String st = "";
        for (int i = 0; i < padding; i++) {
            st += " ";
        }
        st += text;
        for (int i = 0; i < padding; i++) {
            st += " ";
        }
        if (text.length() % 2 != 0) {
            st += " ";
        }


        return st;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.toUpperCase();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten.toUpperCase();
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho.toUpperCase();
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void HienThiThongTinTieuDe() {

        System.out.printf("%-10s %-20s %-10s %-15s %-15s %-25s %-20s %-15s %-20s %-10s",
                printCentered2("Mã NV", 10), "Họ", "Tên", "Ngay Sinh", "Gioi tinh", "Dia chi", "Email", "So DT", "Phong Ban", "Luong");
        System.out.println();


    }

    public void HienThiThongTin() {
        System.out.printf("%-10s %-20s %-10s %-15s %-15s %-25s %-20s %-15s %-20s %-10.0f",
                printCentered2(this.id, 10), this.ho, this.ten, this.ngaySinh, gioiTinh, diaChi, email, soDienThoai, phongBan, luong);
        System.out.println();
    }

    public void CapNhatThongTinNV(NhanVien nhanVien) {
        int colData;
        //Set<char> setFunc = new HashSet<>();
        HashSet<Character> setFunc = new HashSet<>();

        setFunc.addAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "#"));


        Scanner scanner = new Scanner(System.in);


        System.out.println("CHON NOI DUNG CAN CAP NHAT");
        colData = scanner.nextInt();

        while (setFunc.contains(colData)) {
            System.out.println("Vui long chon lai chuc nang: ");
            colData = scanner.nextInt();
        }

        switch (colData) {
            case 1:
                System.out.println("Chon 1");
                break;
            case 2:
                System.out.println("Chon 1");
                break;

        }

    }
}
