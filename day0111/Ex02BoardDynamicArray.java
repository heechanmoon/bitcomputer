package day0111;

import util.ArrayUtil;
import util.ScannerUtil;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex02BoardDynamicArray {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static Board[] boardArray = new Board[0];
    public static void main(String[] args) {
        showMenu();

        SCANNER.close();
    }

    public static void showMenu(){
        while(true){
            String message = "1. 게시글 작성 2. 게시글 보기 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if(userChoice == 1){
                insertBoard();
            } else if(userChoice == 2){
                printBoard();
            } else if(userChoice == 3){
                System.out.println("사용해주셔서 감사합니다.");
                break;
            } else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void insertBoard(){
        int boardNumber = 0;
        int lastIndex = ArrayUtil.size(boardArray)-1;

        Board s = new Board();

        if(ArrayUtil.isEmpty(boardArray)) {
            s.insertBoard(1);
        }else{
            boardNumber = ArrayUtil.get(boardArray,lastIndex).getNumber();
            s.insertBoard(boardNumber+1);
        }

        boardArray = ArrayUtil.add(boardArray,s);

    }



    public static void printBoard(){
        if(ArrayUtil.isEmpty(boardArray)){
            System.out.println("게시글이 없습니다.");
        }else{
            for(int i=0; i<ArrayUtil.size(boardArray); i++){
                System.out.println(boardArray[i].getNumber() + ". " + boardArray[i].getTitle());
            }

            String message = "내용을 볼 게시글의 번호를 입력하세요.(뒤로가기 : 0)";
            int choice = ScannerUtil.nextInt(SCANNER,message);

            Board choiceBoard = new Board();
            int lastIndex = ArrayUtil.size(boardArray)-1;

            int number = -1;

            for(int i=0; i<=lastIndex; i++){
                number = ArrayUtil.get(boardArray,i).getNumber();
                if(number==choice){
                    choiceBoard = ArrayUtil.get(boardArray,i);
                    break;
                }else{
                    number = -1;
                }
            }

            while(choice != 0 && number == -1){
                System.out.println("존재하지 않거나 이미 삭제된 게시글입니다.");
                for(int i=0; i<ArrayUtil.size(boardArray); i++){
                    System.out.println(boardArray[i].getNumber() + ". " + boardArray[i].getTitle());
                }
                choice = ScannerUtil.nextInt(SCANNER, message);
                choiceBoard = new Board();
                lastIndex = ArrayUtil.size(boardArray)-1;

                number = -1;

                for(int i=0; i<=lastIndex; i++){
                    number = ArrayUtil.get(boardArray,i).getNumber();
                    if(number==choice){
                        choiceBoard = ArrayUtil.get(boardArray,i);
                        break;
                    }else{
                        number = -1;
                    }
                }
            }
            if(choice!=0) {
                printOne(choiceBoard);
            }
        }
    }

    public static void printOne(Board choiceBoard){
        choiceBoard.printBoard();
        String message = "1 : 수정 2 : 삭제 3 : 뒤로가기";
        int choice = ScannerUtil.nextInt(SCANNER,message);

        if(choice == 1){
            message = "수정할 제목 : ";
            String title = ScannerUtil.nextLine(SCANNER,message);
            choiceBoard.setTitle(title);
            message = "수정할 내용 : ";
            String write = ScannerUtil.nextLine(SCANNER,message);
            choiceBoard.setWrite(write);
            printOne(choiceBoard);
        } else if(choice == 2) {
            deleteBoard(choiceBoard);
            printBoard();
        } else if(choice == 3){
            printBoard();
        } else{
            System.out.println("잘못된 입력입니다.");
            printOne(choiceBoard);
        }
    }

    public static void deleteBoard(Board choiceBoard){
        boardArray = ArrayUtil.removeByElement(boardArray,choiceBoard);
    }
}