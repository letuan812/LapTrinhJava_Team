package LeTuan.Buoi2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dog extends Animal {
    public String name = "Dog";

    @Override
    void sound() {
        System.out.println("Dog is making a sound: " + name);

    }

}

