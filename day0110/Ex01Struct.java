package day0110;
//자바는 구조체를 지원하지 않는다. 따라서 필요한 데이터타입들을 정의한 클래스를 만든다.

public class Ex01Struct {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 218;
        student1.name = "문희찬";
        student1.korean = 87;
        student1.english = 73;
        student1.math = 94;
    }

    public static void printInfo(Student student){
        System.out.println("번호: "+student.id);
        System.out.println("이름: "+student.name);
    }
}
