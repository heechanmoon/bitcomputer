package day0111;

import util.ArrayUtil;
import util.ScannerUtil;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex01GradebookArray {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static Student[] studentArray = new Student[0];
    public static void main(String[] args) {
        showMenu();

        SCANNER.close();
    }

    public static void showMenu(){
        while(true){
            String message = "1. 학생정보입력 2. 학생정보조회 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if(userChoice == 1){
                insertStudent();
            } else if(userChoice == 2){
                printStudent();
            } else if(userChoice == 3){
                System.out.println("사용해주셔서 감사합니다.");
                break;
            } else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void insertStudent(){
        int StudentNumber = 0;
        int lastIndex = ArrayUtil.size(studentArray)-1;

        Student s = new Student();

        if(ArrayUtil.isEmpty(studentArray)) {
            s.insertStudent(1);
        }else{
            StudentNumber = ArrayUtil.get(studentArray,lastIndex).getId();
            s.insertStudent(StudentNumber+1);
        }

        studentArray = ArrayUtil.add(studentArray,s);

    }



    public static void printStudent(){
        if(ArrayUtil.isEmpty(studentArray)){
            System.out.println("학생정보가 없습니다.");
        }else{
            for(int i=0; i<ArrayUtil.size(studentArray); i++){
                System.out.println(studentArray[i].getId() + ". " + studentArray[i].getName());
            }

            String message = "조회할 학생의 번호를 입력하세요.(뒤로가기 : 0)";
            int choice = ScannerUtil.nextInt(SCANNER,message);

            Student choiceStudent = new Student();
            int lastIndex = ArrayUtil.size(studentArray)-1;

            int number = -1;

            for(int i=0; i<=lastIndex; i++){
                number = ArrayUtil.get(studentArray,i).getId();
                if(number==choice){
                    choiceStudent = ArrayUtil.get(studentArray,i);
                    break;
                }else{
                    number = -1;
                }
            }

            while(choice != 0 && number == -1){
                System.out.println("존재하지 않거나 이미 삭제된 게시글입니다.");
                for(int i=0; i<ArrayUtil.size(studentArray); i++){
                    System.out.println(studentArray[i].getId() + ". " + studentArray[i].getName());
                }
                choice = ScannerUtil.nextInt(SCANNER,message);

                choiceStudent = new Student();
                lastIndex = ArrayUtil.size(studentArray)-1;

                number = -1;

                for(int i=0; i<=lastIndex; i++){
                    number = ArrayUtil.get(studentArray,i).getId();
                    if(number==choice){
                        choiceStudent = ArrayUtil.get(studentArray,i);
                        break;
                    }else{
                        number = -1;
                    }
                }
            }
            if(choice!=0) {
                printOne(choiceStudent,number);
            }
        }
    }

    public static void printOne(Student choiceStudent, int number){
        choiceStudent.print();
        String message = "1 : 정보수정 2 : 삭제 3 : 뒤로가기";
        int choice = ScannerUtil.nextInt(SCANNER,message);

        if(choice == 1){
            choiceStudent.insertStudent(number);
            ArrayUtil.set(studentArray,number-1,choiceStudent);
            printOne(choiceStudent,number);
        } else if(choice == 2) {
            deleteBoard(choiceStudent);
            printStudent();
        } else if(choice == 3){
            printStudent();
        } else{
            System.out.println("잘못된 입력입니다.");
            printOne(choiceStudent,number);
        }
    }

    public static void deleteBoard(Student choiceStudent){
        studentArray = ArrayUtil.removeByElement(studentArray,choiceStudent);
    }
}