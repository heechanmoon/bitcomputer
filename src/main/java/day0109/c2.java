package day0109;

import java.util.Scanner;

public class c2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        for(int i=star; i>0; i--){
            for(int j=i; j>0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        scanner.close();
    }


}
