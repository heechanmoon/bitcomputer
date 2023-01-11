package day0111;

public class Ex01Gradebook01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.print();

        Student s2 = new Student();
        s2.id = 186;
        s2.name = "문희찬";
        s2.korean = 75;
        s2.english = 46;
        s2.math = 92;

        Student s3 = new Student();
        s3.id = 186;
        s3.name = "문희찬";
        s3.korean = 75;
        s3.english = 46;
        s3.math = 92;

        s2.print();
        s3.print();

        Student s4 = null;

        System.out.println(s2.equals(s4));
    }
}