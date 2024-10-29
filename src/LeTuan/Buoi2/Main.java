package Buoi2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien_a = new SinhVien("001", "Giao duc hoc", "Le Anh Tuan",
                39, "0914555875", "Cao Lanh", "KH");
        System.out.println(sinhVien_a);
        sinhVien_a.HienThiTT_LopCon();
        //sinhVien_a.HienThiTT();

        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animal1 = new Dog();

        System.out.println(animal.name);
        System.out.println(dog.name);
        System.out.println(animal1.name);

        animal.sound();
        dog.sound();
        animal1.sound();


    }
}