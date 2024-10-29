package Buoi2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SinhVien extends ConNguoi {

    private final String maSV;
    private final String chuyenNganh;

    SinhVien(String maSV, String chuyenNganh, String hoTen,
             int tuoi, String dienThoai, String diaChi,
             String tinhTrangHonNhan) {
        super(hoTen, tuoi, dienThoai, diaChi, tinhTrangHonNhan);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;

    }

    public void HienThiTT_LopCon() {
        super.HienThiTT_LopCha(); //Ke thua phuong thuc
        System.out.println("Ma Sinh vien: " + maSV);
        System.out.println("Chuyen nganh: " + chuyenNganh);
    }

}