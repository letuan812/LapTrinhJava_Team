package LeTuan.Buoi3.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("**************x");
        System.out.println("Cau hoi 1. Them vao danh sach 3 sinh vien va in danh sach vua nhap");
        System.out.println("**************x");
        cauHoi1(studentList);

        System.out.println("Cau hoi 2. Them vao sinh vien khi nhap tu ban phim va in danh sach sinh vien hien co");

        cauHoi2NhapDS(studentList);


        System.out.println("IN DANH SACH SAU KHI NHAP");
        for (Student std : studentList) {
            std.display();
        }

    }

    private static void cauHoi1(List<Student> stLst) {
        Student student1 = new Student("1", "Tuan1", 30);
        Student student2 = new Student("2", "Tuan2", 32);
        Student student3 = new Student("3", "Tuan3", 33);


        stLst.add(student1);
        stLst.add(student2);
        stLst.add(student3);

        if (stLst.isEmpty()) {
            System.out.println("Danh sach rong");

        } else {
            System.out.println("DANH SACH...(v forEach)");
            stLst.forEach(st -> {
                        st.display();
                    }
            );
            System.out.println("DANH SACH...(v2)");
            for (Student std : stLst) {
                std.display();
            }


        }

        System.out.println();
    }

    private static void cauHoi2NhapDS(List<Student> stLst) {
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        int age;
        char yesNo;
        Student student = new Student("null", "null", -1);
        yesNo = 'Y';
        while (yesNo == 'Y' || yesNo == 'y') {

            System.out.print("Nhap ma sv: ");
            student.setId(scanner.nextLine());
            System.out.print("Nhap Ho ten sv: ");
            student.setName(scanner.nextLine());
            System.out.print("Nhap Tuoi sv: ");
            student.setAge(scanner.nextInt());
            scanner.nextLine();

//            System.out.print("Ban muon nhap tiep khong? (Y/N) ");
//            yesNo = scanner.nextLine();

            stLst.add(student);

            System.out.print("Ban muon nhap tiep khong? (Y/N) ");
            yesNo = scanner.nextLine().charAt(0);

        }


    }
}
