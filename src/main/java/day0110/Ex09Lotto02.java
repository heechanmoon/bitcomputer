package day0110;

import java.util.Random;

public class Ex09Lotto02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[6];

        for(int i=0; i<lottoNumbers.length;){
            int temp = random.nextInt(45)+1;
            boolean numberSwitch = true;

            for(int j=0; j<i; j++) {
                if(temp==lottoNumbers[j]){
                    numberSwitch = false;
                }
            }

            if(numberSwitch){
                lottoNumbers[i] = temp;
                i++;
            }
        }

        for(int i=0;i<lottoNumbers.length-1;i++){
            int swap = 0;
            if(lottoNumbers[i]>lottoNumbers[i+1]){
                swap = lottoNumbers[i+1];
                lottoNumbers[i+1] = lottoNumbers[i];
                lottoNumbers[i] = swap;
                i = -1;
            }
        }

        for(int i=0;i<lottoNumbers.length;i++){
            System.out.printf("%d ",lottoNumbers[i]);
        }
        System.out.println();
    }
}
