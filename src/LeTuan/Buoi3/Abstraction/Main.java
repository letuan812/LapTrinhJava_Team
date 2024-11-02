package LeTuan.Buoi3.Abstraction;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); //Tao bien dog kieu du lieu Animal (Object) tu doi tuong Dog
        Animal cat = new Cat("Henrry",1200,12);

        dog.sound();
        dog.info();
        cat.sound();
        cat.info();


    }
}
