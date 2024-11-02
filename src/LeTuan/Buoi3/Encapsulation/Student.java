package LeTuan.Buoi3.Encapsulation;

public class Student {
   private String id;
    private String name;
    private int age;
    private int grade;


    public Student(String id, String name, int age, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Tuoi phai >=0");
        } else {
            this.age = age;
        }

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 10) {
            System.out.println("Nhap sai diem");
            return;
        }

        this.grade = grade;
    }

    public void displayInfo() {

        System.out.println("Thong tin SV:\nMa SV: " + id + "\nHo va ten: "
                + this.name + "\nTuoi: " +  age + "\nDiem: " + this.grade);
    }
}
