package day0110;

import util.ScannerUtil;

import java.util.Random;
import java.util.Scanner;

public class Ex10Lotto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNumbers = new int[6];
        int[] computerNumbers = new int[6];

        while(true) {
            String message = "로또번호 추첨기 1. 수동 2. 자동 3. 종료 4. 1등 당첨될때까지";
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if (userChoice == 1) {
                int[] user = manualLotto(lottoNumbers, scanner);
                int[] computer = autoLotto(computerNumbers, random);
                lottoOn(user, computer);
            } else if (userChoice == 2) {
                int[] user = autoLotto(lottoNumbers, random);
                int[] computer = autoLotto(computerNumbers, random);
                lottoOn(user,computer);
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else if (userChoice == 4){
                int count = 0;
                int buyCount = 0;
                int totalCount = 0;
                for(int i=0; i<100; i++) {
                    while (count != 6) {
                        int[] user = autoLotto(lottoNumbers, random);
                        int[] computer = autoLotto(computerNumbers, random);
                        count = lottoFirstOn(user, computer);
                        buyCount++;
                    }
                    System.out.println(buyCount + "번만에 당첨!");
                    totalCount += buyCount;
                    count = 0;
                    buyCount=0;
                }
                System.out.printf("평균확률 : %d분의 %d\n",totalCount/100,1);
            }
        }
        System.out.println();
    }

    public static int[] autoLotto(int[] lottoNumbers, Random random) {
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

        /*
        for(int i=0;i<lottoNumbers.length;i++){
            System.out.printf("%d ",lottoNumbers[i]);
        }
        System.out.println();
        */

        return lottoNumbers;
    }

    public static int[] manualLotto(int[] lottoNumbers, Scanner scanner) {
        for(int i=0; i<lottoNumbers.length;){
            int temp = scanner.nextInt();
            boolean numberSwitch = true;

            for(int j=0; j<i; j++) {
                if(temp==lottoNumbers[j]){
                    System.out.println("중복된 번호입니다.");
                    numberSwitch = false;
                }else if(temp>45 || temp<1){
                    System.out.println("잘못된 입력입니다. 1~45까지의 숫자를 입력해주세요.");
                    numberSwitch = false;
                    break;
                }
            }

            if(numberSwitch){
                lottoNumbers[i] = temp;
                i++;
            }
        }

        for(int i=0;i<lottoNumbers.length-1;i++) {
            int swap = 0;
            if (lottoNumbers[i] > lottoNumbers[i + 1]) {
                swap = lottoNumbers[i + 1];
                lottoNumbers[i + 1] = lottoNumbers[i];
                lottoNumbers[i] = swap;
                i = -1;
            }
        }

        /*
        for(int i=0;i<lottoNumbers.length;i++){
            System.out.printf("%d ",lottoNumbers[i]);
        }
        System.out.println();
        */

        return lottoNumbers;
    }

    public static void lottoOn(int[] user, int[] computer) {
        int count = 0;

        for(int i=0; i<user.length; i++){
            for(int j=0; j<computer.length; j++){
                if(user[i]==computer[j]) {
                    count++;
                }
            }
        }

        if(count<=1){
            System.out.println("아쉽게도 당첨이 되지 않았습니다.");
        }else if(count==2){
            System.out.println("5등");
        }else if(count==3){
            System.out.println("4등");
        }else if(count==4){
            System.out.println("3등");
        }else if(count==5){
            System.out.println("2등");
        }else if(count==6){
            System.out.println("★1등!★");
        }
    }

    public static int lottoFirstOn(int[] user, int[] computer) {
        int count = 0;

        for(int i=0; i<user.length; i++){
            for(int j=0; j<computer.length; j++){
                if(user[i]==computer[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}


