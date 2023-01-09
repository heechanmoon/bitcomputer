package day0109;

public class ex01method {
    public static void main(String args[]){

        ex01method e = new ex01method();

        int a = 12;
        int b = 5;
        int result = 0;
        e.printIntro();
        printBigger(a,b);
        result = printExpo(b,a);

        System.out.println("b의 a승은 "+result);
        System.out.println("a의 b승은 "+printExpo(a,b));
    }

    public static int printExpo(int number1, int number2){
        int result = 1;
        for(int i=0; i<number2; i++){
            result *= number1;
        }
        return result;
    }

    public static void printBigger(int number1, int number2){
        System.out.println("a : "+number1+"\n"+"b : "+number2);
        if(number1>number2){
            System.out.println("a가 더 큽니다.");
        }
        else{
            System.out.println("b가 더 크거나 같습니다.");
        }
    }

    public void printIntro(){
        System.out.println("Ex01Method");
        System.out.println("작성자: 문희찬");
        System.out.println("작성일: 2023년 01월 09일");
        System.out.println("내용: 메소드에 대한 설명 및 예제");
    }
}
