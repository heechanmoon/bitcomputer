package day0109;

import java.util.Scanner;

public class c3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int star = scanner.nextInt();

        String stars = "";

        for(int i=1; i<=star; i++){
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
