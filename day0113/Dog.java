package day0113;

public class Dog extends Animal{
    public Dog(){
        System.out.println("Dog() 호출");
    }

    public void stopSound(){
        System.out.println("개 짖는 소리좀 안나게 하라!!!!!!!");
    }

    public void eat(){
        System.out.println("개는 잡식이다");
    }
}
