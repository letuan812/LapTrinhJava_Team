package Buoi3.Collection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //     boolean sttList;
        List<Student> studentList = new ArrayList<>();
        //       sttList = studentList.isEmpty();

        Student student1 = new Student(1, "Tuan1", 30);
        Student student2 = new Student(2, "Tuan2", 32);
        Student student3 = new Student(3, "Tuan3", 33);


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        if (studentList.isEmpty()) {
            System.out.println("Danh sach rong");

        } else {
            System.out.println("DANH SACH...");
            studentList.forEach(student -> {
                        student.display();
                    }
            );
            System.out.println("DANH SACH...(v2)");
            for (Student std : studentList) {
                std.display();
            }


        }


        System.out.println();


    }


}
