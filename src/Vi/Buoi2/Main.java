package Buoi2;

public class Main {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        public static void main(String[] args) {
            sinhvien sinhVien_a = new sinhvien("200763", "Ky thuat phan mem", "Le Nguyen Yen Vi",
                    18, "0819243391", "Cao Lanh", "DT");
            System.out.println(sinhVien_a);
            sinhVien_a.HienThiTT_LopCon();
            sinhVien_a.HienThiTT_LopCha();
        }
}
