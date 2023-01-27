package day0113;

public class Cat implements IAnimal{

    @Override
    public void makeSound() {
        System.out.println("냥!");
    }

    @Override
    public void move() {
        System.out.println("휘릭");
    }

    @Override
    public void eat() {
        System.out.println("핥핥");
    }
}
