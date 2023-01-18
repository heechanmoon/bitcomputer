package day0116;

public class Kaprika {
    public static void main(String[] args) {
        int firstPart;
        int secondPart;
        int kaprika;
        System.out.println("두자리 카프리카 수 목록");
        for(int i=10; i<100; i++){
            firstPart = i/10;
            secondPart = i%10;

            kaprika = (firstPart+secondPart) * (firstPart+secondPart);

            if(kaprika==i){
                System.out.println(i);
            }
        }

        System.out.println("네자리 카프리카 수 목록");
        for(int i=1000; i<9999; i++){
            firstPart = i/100;
            secondPart = i%100;

            kaprika = (firstPart+secondPart) * (firstPart+secondPart);

            if(kaprika==i){
                System.out.println(i);
            }
        }
    }
}
