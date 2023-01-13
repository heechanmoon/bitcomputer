package day0113;

//인터페이스를 상속한 클래스는 무조건 인터페이스에 정의된 메소드를 구현해야한다.
public class Rabbit implements IAnimal {

    @Override
    public void makeSound() {
        System.out.println("톡톡");
    }

    @Override
    public void move() {
        System.out.println("깡~총 깡~~총 뛰어서~~~!");
    }

    @Override
    public void eat() {
        System.out.println("풀뜯기");
    }

    public void sleep(){
        System.out.println("Zzz..........");
    }
}
