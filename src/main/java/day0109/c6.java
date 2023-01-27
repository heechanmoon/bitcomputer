package day0109;

import java.util.Scanner;

public class c6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        String stars = "";

        for(int i=star; i>=1; i--){
            for(int j=1; j<=i-1; j++) {
                stars += " ";
            }

            for(int k=1; k<=(star-i)*2+1; k++){
                stars += "*";
            }
            stars += "\n";
        }

        for(int i=2; i<=star; i++){
            for(int j=1; j<=i-1; j++) {
                stars += " ";
            }

            for(int k=1; k<=(star-i)*2+1; k++){
                stars += "*";
            }
            stars += "\n";
        }

        System.out.print(stars);

        scanner.close();
    }


}
