package Buoi2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConNguoi {
    private final String hoTen;
    private final int tuoi;
    private final String dienThoai;
    private final String diaChi;
    private final String tinhTrangHonNhan;

    public ConNguoi(String hoTen, int tuoi, String dienThoai, String diaChi, String tinhTrangHonNhan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public void HienThiTT_LopCha() {
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("So DT: " + dienThoai);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tinh trang HN: " + tinhTrangHonNhan);
    }


}