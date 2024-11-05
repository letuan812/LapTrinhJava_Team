package LeTuan.Exercise.Bai1;

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

    public void HienThiThongTin(boolean tieuDe) {
        if (tieuDe) {
            System.out.printf("%-10s %-30s %-10s %12s %-10s %-30s %-20s %-15s %-20s %-10d",
                    printCentered2("Mã NV", 10), "Họ", "Tên", "Ngay Sinh", "Gioi tinh", "Dia chi", "Email", "So DT", "Phong Ban", "Luong");
        }


    }

    public void HienThiThongTin() {
        System.out.printf("%-10s %-30s %-10s %12s %-10s %-30s %-20s %-15s %-20s %-10d",
                printCentered2(this.id, 10), this.ho, this.ten, this.ngaySinh, gioiTinh, diaChi, email, soDienThoai, phongBan, luong);
    }
}
