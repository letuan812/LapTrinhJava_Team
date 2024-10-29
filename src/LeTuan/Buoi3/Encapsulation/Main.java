package Buoi3.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Le Tuan", 39, 10);


        student.displayInfo();

        student.setName("Le Anh Tuan");
        student.setAge(30);
        student.setGrade(11);

        student.displayInfo();
    }
}
