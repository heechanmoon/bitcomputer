package day0110;
//다차원 배열
public class MultiArray {
    public static void main(String[] args) {
        int[][] intArrays = new int[5][4];

        System.out.printf("intArrays[0] " + intArrays[0]+"\n");
        System.out.printf("intArrays[1][2] " + intArrays[1][2]+"\n");

        //가변형 배열
        intArrays = new int[4][];
        System.out.println("intArrays[0] " + intArrays[0]);

        intArrays[0] = new int[7];
        intArrays[1] = new int[6];
        intArrays[2] = new int[9];
        intArrays[3] = new int[4];

        System.out.println("intArrays[1][2] "+intArrays[1][2]);
    }
}
