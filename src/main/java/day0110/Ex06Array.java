package day0110;
//배열(Array): 같은 데이터타입 여러개를 하나로 묶어서 저장할 수 있는 타입
//초기화할때 반드시 몇개로 이루어져있는지 결정해야한다.(크기)
public class Ex06Array {
    public static void main(String[] args) {
        int[] intArray = new int[3];

        for(int i=0; i < intArray.length; i++){
            System.out.printf("intArray[%d]: %d\n",i,intArray[i]);
        }

        String[] stringArray = new String[4];
        for(int i=0; i < stringArray.length; i++){
            System.out.printf("stringArray[%d]: %s\n",i,stringArray[i]);
        }
    }
}
