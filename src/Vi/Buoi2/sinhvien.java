package Buoi2;

public class sinhvien extends connguoi {
    private final String maSV;
    private final String chuyenNganh;

    sinhvien(String maSV, String chuyenNganh, String hoTen, int tuoi, String dienThoai, String diaChi, String tinhTrangHonNhan) {
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
