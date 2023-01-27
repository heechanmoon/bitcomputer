package day0109;

import java.util.Scanner;

public class beakjoon9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        String stars = "";

        for(int i=star; i>=1; i--){
            for(int j=i; j<star; j++) {
                stars += " ";
            }

            for(int k=1; k<=i*2-1; k++){
                stars += "*";
            }
            stars += "\n";
        }

        for(int i=2; i<=star; i++){
            for(int j=i; j<star; j++) {
                stars += " ";
            }

            for(int k=1; k<=i*2-1; k++){
                stars += "*";
            }
            stars += "\n";
        }

        System.out.print(stars);

        scanner.close();
    }


}
