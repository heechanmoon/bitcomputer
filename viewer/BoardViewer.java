package viewer;

import controller.BoardController;
import model.BoardDTO;
import model.UserDTO;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardViewer {
    private final Scanner SCANNER;
    private BoardController boardController;
    private CommentViewer commentViewer;
    private UserViewer userViewer;
    private static int nextId = 1;
    private UserDTO logIn;

    public BoardViewer(Scanner scanner){
        SCANNER = scanner;
        boardController = new BoardController();
    }

    public void setUserViewer(UserViewer userViewer){
        this.userViewer = userViewer;
    }

    public void setCommentViewer(CommentViewer commentViewer){
        this.commentViewer = commentViewer;
    }

    public void setLogIn(UserDTO logIn){
        this.logIn = logIn;
    }

    public void showIndex(){
        while (true) {
            String message = "1. 입력 2. 목록 보기 3. 종료";
            int userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                writeBoard();
            } else if (userChoice == 2) {
                printList();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    private void writeBoard() {
        BoardDTO b = new BoardDTO();

        b.setWriterId(logIn.getId());
        b.setNickname(logIn.getNickname());

        b.setNumber(nextId++);

        String message;

        message = "글의 제목을 입력해주세요.";
        b.setTitle(ScannerUtil.nextLine(SCANNER, message));

        message = "글의 내용을 입력해주세요.";
        b.setWrite(ScannerUtil.nextLine(SCANNER, message));

        boardController.insert(b);
    }

    private void printList() {
        int userChoice = -1;

        if (boardController.isEmpty()) {
            System.out.println("아직 등록된 글이 존재하지 않습니다.");
        } else {
            ArrayList<BoardDTO> boardList = boardController.getList();
            for (BoardDTO b : boardList) {
                System.out.printf("%d. %s\n", b.getNumber(), b.getTitle());
            }
            String message = "상세보기할 글의 번호나 뒤로 가실려면 0을 입력해주세요.";
            userChoice = ScannerUtil.nextInt(SCANNER, message);

            BoardDTO b = new BoardDTO();
            b.setNumber(userChoice);

            while (userChoice != 0 && !boardList.contains(b)) {
                System.out.println("잘못 입력하셨습니다.");
                userChoice = ScannerUtil.nextInt(SCANNER, message);
                b.setNumber(userChoice);
            }

            if (userChoice != 0) {
                printOne(userChoice);
            }
        }
    }

    private void printOne(int id) {
        BoardDTO temp = new BoardDTO();
        temp.setNumber(id);

        ArrayList<BoardDTO> boardList = boardController.getList();

        //BoardDTO b = ArrayUtil.get(array, ArrayUtil.indexOf(array, temp));
        BoardDTO b = boardList.get(boardList.indexOf(temp));

        System.out.println("게시글 번호: "+b.getNumber()+"번 게시자 이름: "+b.getNickname());
        System.out.printf("제목: %s\n",b.getTitle());
        System.out.printf("내용: %s\n",b.getWrite());
        System.out.println("==================================");

        commentViewer.setBoardNumber(b);
        commentViewer.setLogIn(logIn);
        commentViewer.printList();

        String message;
        int userChoice;

        if(b.getWriterId() == logIn.getId()){
            message = "1. 수정 2. 삭제 3. 뒤로가기";
            userChoice = ScannerUtil.nextInt(SCANNER, message, 1, 3);
        } else {
            message = "3. 뒤로가기";
            userChoice = ScannerUtil.nextInt(SCANNER, message, 3, 3);
        }

        if (userChoice == 1) {
            message = "새로운 제목을 입력해주세요.";
            b.setTitle(ScannerUtil.nextLine(SCANNER, message));

            message = "새로운 내용을 입력해주세요.";
            b.setWrite(ScannerUtil.nextLine(SCANNER, message));

            boardController.update(b);

            printOne(id);
        } else if (userChoice == 2) {
            boardController.delete(b.getNumber());
        } else {
            printList();
        }
    }
}