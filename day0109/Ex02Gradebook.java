package day0109;

import java.util.Scanner;

public class Ex02Gradebook {
    public static void main(String args[]){
        inputMethod();
    }

    public static int inputNumber(Scanner scanner){
        int number = scanner.nextInt();
        return number;
    }

    public static String inputName(Scanner scanner){
        String name = scanner.next();
        return name;
    }

    public static int inputScore(Scanner scanner){
        int min = 0;
        int max = 100;
        int score = scanner.nextInt();
        while(score < min || score > max){
            System.out.println("잘못 입력하셨습니다.");
            score = scanner.nextInt();
        }
        return score;
    }

    public static void inputMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("번호 : ");
        int number = inputNumber(scanner);
        System.out.println("이름 : ");
        String name = inputName(scanner);
        System.out.println("국어 점수 : ");
        int koreanScore = inputScore(scanner);
        System.out.println("영어 점수 : ");
        int englishScore = inputScore(scanner);
        System.out.println("수학 점수 : ");
        int mathScore = inputScore(scanner);

        scanner.close();

        printResult(number,name,koreanScore,englishScore,mathScore);
    }

    public static void printResult(int number, String name, int koreanScore, int englishScore, int mathScore){
        System.out.println("번호: "+number+"번 이름: "+name);
        System.out.printf("국어: %d점 영어: %d점 수학: %d점\n",koreanScore,englishScore,mathScore);
        int sum = calculateSum(koreanScore,englishScore,mathScore);
        double avg = calculateAvg(sum);
        System.out.printf("총점: %d점 평균: %f점\n",sum, avg);
    }

    public static double calculateAvg(int sum){
        final int SUBJECT_SIZE = 3;
        double avg = (double)sum/SUBJECT_SIZE;
        return avg;
    }

    public static int calculateSum(int koreanScore, int englishScore, int mathScore){
        int sum = koreanScore+englishScore+mathScore;
        return sum;
    }
}
