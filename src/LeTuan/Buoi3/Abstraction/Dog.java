package LeTuan.Buoi3.Abstraction;

public class Dog extends Animal {

    @Override
    void info() {
        System.out.println("Thong tin chu cho");
    }

    @Override
    void sound() {
        System.out.println("Class Dog");
    }
}
