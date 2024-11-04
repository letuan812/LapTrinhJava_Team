package LeTuan.Exercise.Bai1;

public class NhanVien {
    private final String id;
    private final String ten;
    private final String ho;
    private String soDienThoai;
    private String email;
    private String diaChi;
    private String ngaySinh;
    private String gioiTinh;
    private String phongBan;
    private double luong;

    public NhanVien(String id, String ten, String ho, String soDienThoai, String email,
                    String diaChi, String ngaySinh, String gioiTinh, String phongBan, double luong) {


        this.id = id;
        this.ten = ten;
        this.ho = ho;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.luong = luong;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getHo() {
        return ho;
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
