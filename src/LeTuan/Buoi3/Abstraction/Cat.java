package LeTuan.Buoi3.Abstraction;

public class Cat extends Animal {
String name;
int weight;
int age;

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    void sound() {
        System.out.println("Class Cat");
    }

    @Override
    void info() {

        System.out.println("Biet danh cua chu meo la: " + name + " chu duoc " + age + " +  thang tuoi va can nang: " + weight + "gam." );

    }
}
