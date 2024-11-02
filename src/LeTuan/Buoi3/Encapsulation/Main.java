package LeTuan.Buoi3.Encapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cau 1: In thong tin sinh vien va cap nhat thong tin qua phuong thuc da xay dung");
        System.out.println("");
        cauHoi1();
        System.out.println("----------------------");


    }
    private static void cauHoi1(){
        Student student = new Student("001", "Le Tuan", 39, 10);


        student.displayInfo();

        student.setName("Le Anh Tuan");
        student.setAge(30);
        student.setGrade(11);

        student.displayInfo();

    }
}
