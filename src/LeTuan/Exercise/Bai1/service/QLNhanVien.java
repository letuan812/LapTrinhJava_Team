package LeTuan.Exercise.Bai1.service;

import LeTuan.Exercise.Bai1.model.NhanVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLNhanVien {
    List<NhanVien> nhanVienList = new ArrayList<>();

    public void ThemNhanVien(NhanVien nhanVien) {
        nhanVienList.add(nhanVien);
    }

    public void HienThiNhanVien() {
        nhanVienList.forEach(nhanVien -> {
            System.out.println(nhanVien.getId());
            System.out.println(nhanVien.getHo());
            System.out.println(nhanVien.getTen());
        });
    }

    public void XoaNhanVien(String id) {
        nhanVienList.removeIf(nv -> nv.getId().equals(id));
// TUONG TU
//        List<NhanVien> nhanVienXoa = new ArrayList<>();
//
//        for (NhanVien nv : nhanVienList) {
//            if (nv.getId().equals(id)) {
//                nhanVienXoa.add(nv);
//            }
//        }
//        nhanVienList.removeAll(nhanVienXoa);

        nhanVienList.sort(Comparator.comparing(NhanVien::getLuong));

        System.out.println("Nhan vien da duoc xoa.");
    }


}
