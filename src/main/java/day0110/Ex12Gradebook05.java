package day0110;

import java.util.Scanner;

public class Ex12Gradebook05 {

    public static final int ARRAY_LENGTH = 5;
    public static void main(String args[]) {
        int key = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[ARRAY_LENGTH];
        boolean inputSwitch = false;
        boolean fullSwitch = false;
        while(true) {
            System.out.println("학생정보 입력 : 1 / 학생정보 출력 : 2 / 종료 : 3");
            key = scanner.nextInt();

            if (key == 1) {
                if(i<ARRAY_LENGTH) {
                    student[i] = inputStudent(scanner);
                    inputSwitch = true;
                    i++;
                }else{
                    for(int j=0; j<i; j++) {
                        if(j!=ARRAY_LENGTH-1) {
                            student[j] = student[j + 1];
                        }else{
                            student[j] = inputStudent(scanner);
                        }
                    }
                }
            } else if (key == 2) {
                if (inputSwitch) {
                    if(fullSwitch){
                        for(int j = 0; j < ARRAY_LENGTH; j++) {
                            printStudent(student[j]);
                        }
                    }else {
                        for (int j = 0; j < i; j++) {
                            printStudent(student[j]);
                        }
                    }
                } else {
                    System.out.println("학생 정보가 입력되지 않았습니다.");
                }
            } else if (key == 3) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
    public static Student inputStudent(Scanner scanner){

        int min = 0;
        int max = 100;

        Student student = new Student();

        System.out.println("번호 : ");
        student.id = scanner.nextInt();
        System.out.println("이름 : ");
        student.name = scanner.next();
        System.out.println("국어 점수 : ");
        student.korean = scanner.nextInt();
        while(student.korean < min || student.korean > max){
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("국어 점수 : ");
            student.korean = scanner.nextInt();
        }
        System.out.println("영어 점수 : ");
        student.english = scanner.nextInt();
        while(student.english < min || student.english > max){
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("영어 점수 : ");
            student.english = scanner.nextInt();
        }
        System.out.println("수학 점수 : ");
        student.math = scanner.nextInt();
        while(student.math < min || student.math > max){
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("수학 점수 : ");
            student.math = scanner.nextInt();
        }

        return student;
    }

    public static void printStudent(Student student){
        System.out.println("번호: "+student.id+"번 이름: "+student.name);
        System.out.printf("국어: %d점 영어: %d점 수학: %d점\n",student.korean,student.english,student.math);
        int sum = calculateSum(student.korean,student.english,student.math);
        double avg = calculateAvg(sum);
        System.out.printf("총점: %d점 평균: %.2f점\n",sum, avg);
        System.out.println("==================================");
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
