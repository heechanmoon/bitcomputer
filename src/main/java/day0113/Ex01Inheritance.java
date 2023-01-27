package day0113;

public class Ex01Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        animal.eat();

        Dog dog = new Dog();
        dog.move();
        dog.eat();
        dog.stopSound();

        Animal a = new Dog(); //부모 클래스는 자식 클래스 생성자로 정의될 경우, 자식 클래스만 가지고 있는 메소드를 사용못한다.(stopSound)
        a.move();
        a.eat();

        IAnimal r = new Cat();
        showSample(r);
        r.move();
        r.eat();
        r.makeSound();
    }

    public static void showSample(IAnimal animal){
        animal.makeSound();
        animal.move();
        animal.eat();
    }

    public static void showSample(Rabbit rabbit){

    }
}
