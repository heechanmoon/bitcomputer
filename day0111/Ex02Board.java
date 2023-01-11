package day0111;

import util.ScannerUtil;

import java.util.Scanner;

public class Ex02Board {
    public static final int STUDENT_SIZE = 100;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static Board[] boardArray = new Board[STUDENT_SIZE];
    public static void main(String[] args) {
        showMenu();

        SCANNER.close();
    }

    public static void showMenu(){
        while(true){
            String message = "1. 게시글 작성 2. 게시글 보기 3.게시글 삭제 4. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);

            if(userChoice == 1){
                insertBoard();
            } else if(userChoice == 2){
                printBoard();
            } else if(userChoice == 3){
                deleteBoard();
            } else if(userChoice == 4){
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    public static void insertBoard(){
        int index = findNextIndex();
        int boardNumber = 0;
        if(index == -1){
            System.out.println("게시글을 더이상 작성할 수 없습니다.");
        }else {
            Board s = new Board();

            if(index!=0) {
                boardNumber = boardArray[index - 1].number + 1;
                s.insertBoard(boardNumber);
            }else{
                s.insertBoard(1);
            }

            boardArray[index] = s;
        }
    }

    public static  void deleteBoard(int deleteNumber){
        int deleteIndex = -1;
        for(int i = 0; i<findNextIndex(); i++){
            if(boardArray[i].number==deleteNumber){
                deleteIndex = i;
            }
        }
        if(deleteIndex!=-1) {
            for (int i = deleteIndex; i < findNextIndex() - 1; i++) {
                boardArray[i] = boardArray[i + 1];
            }
            boardArray[findNextIndex()-1] = null;
        }else{
            System.out.println("존재하지 않거나 이미 삭제된 게시글입니다.");
        }
    }

    public static int findNextIndex(){
        for(int i = 0; i < boardArray.length; i++){
            if(boardArray[i] == null){
                return i;
            }
        }
        return -1;
    }
    public static void printBoard(){
        if(findNextIndex()==0){
            System.out.println("게시글이 없습니다.");
        }else{
            int lastIndex = findNextIndex();
            if(lastIndex == -1){
                lastIndex = STUDENT_SIZE;
            }
            for(int i=0; i<lastIndex; i++){
                Board board = boardArray[i];
                board.printBoard();
            }
        }
    }

    public static void deleteBoard(){
        if(findNextIndex()==0){
            System.out.println("게시글이 없습니다.");
        }else{
            String message;

            message = "삭제할 게시물 번호를 입력해주세요.";
            int number = ScannerUtil.nextInt(SCANNER, message);

            deleteBoard(number);
        }
    }
}