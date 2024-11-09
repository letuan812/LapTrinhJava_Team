package LeTuan.Exercise.Bai1.model;

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


}
