package viewer;

import controller.CommentController;
import model.BoardDTO;
import model.CommentDTO;
import model.UserDTO;
import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class CommentViewer {
    private final Scanner SCANNER;
    private CommentController commentController;
    private UserViewer userViewer;
    private BoardViewer boardViewer;
    private static int nextId = 1;
    private UserDTO logIn;
    private BoardDTO boardNumber;

    public CommentViewer(Scanner scanner){
        SCANNER = scanner;
        commentController = new CommentController();
    }

    public void setBoardViewer(BoardViewer boardViewer){
        this.boardViewer = boardViewer;
    }

    public void setLogIn(UserDTO logIn){
        this.logIn = logIn;
    }

    public void setBoardNumber(BoardDTO boardNumber){
        this.boardNumber = boardNumber;
    }

    private void writeComment() {
        CommentDTO b = new CommentDTO();

        b.setWriterId(logIn.getId());
        b.setNickname(logIn.getNickname());

        b.setNumber(boardNumber.getNumber());

        String message;

        message = "댓글 내용을 입력해주세요.";
        b.setWrite(ScannerUtil.nextLine(SCANNER, message));

        commentController.insert(b);
        printList();
    }

    public void printList() {
        int userChoice = -1;

        if (commentController.isEmpty()) {
            System.out.println("댓글이 존재하지 않습니다.");
            String message = "1.댓글 추가";
            userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                writeComment();
            }
        } else {
            ArrayList<CommentDTO> commentList = commentController.getList();
            System.out.println("댓글 목록");
            for (CommentDTO b : commentList) {
                if(b.getNumber()==boardNumber.getNumber()) {
                    System.out.printf("(%d)%s: %s\n", b.getCommentNumber(), b.getNickname(), b.getWrite());
                }
            }
            String message = "1.댓글 추가  2.댓글 삭제  3.댓글 수정";
            userChoice = ScannerUtil.nextInt(SCANNER, message);
            if (userChoice == 1) {
                writeComment();
            } else if (userChoice == 2) {
                CommentDTO b;
                message = "삭제할 댓글의 번호를 입력해주세요.";
                userChoice = ScannerUtil.nextInt(SCANNER, message);
                b = commentController.selectById(userChoice);
                b.setCommentNumber(userChoice);
                if(b.getNickname() == logIn.getNickname()){
                    commentController.delete(b);
                } else{
                    System.out.println("삭제할 권한이 없습니다.");
                }
            } else if (userChoice == 3){
                CommentDTO b;
                message = "수정할 댓글의 번호를 입력해주세요.";
                userChoice = ScannerUtil.nextInt(SCANNER, message);
                b = commentController.selectById(userChoice);
                b.setCommentNumber(userChoice);
                if(b.getNickname() == logIn.getNickname()){
                    message = "수정 내용을 입력해주세요.";
                    String comment = ScannerUtil.nextLine(SCANNER, message);
                    b.setWrite(comment);
                    commentController.update(b);
                } else{
                    System.out.println("수정할 권한이 없습니다.");
                }
            }
        }
    }

    /*
    private void printOne(int id) {
        CommentDTO temp = new CommentDTO();
        temp.setNumber(id);

        ArrayList<CommentDTO> commentList = commentController.getList();

        //BoardDTO b = ArrayUtil.get(array, ArrayUtil.indexOf(array, temp));
        CommentDTO b = commentList.get(commentList.indexOf(temp));

        System.out.println("게시글 번호: "+b.getNumber()+"번 게시자 이름: "+b.getNickname());
        System.out.printf("제목: %s\n",b.getTitle());
        System.out.printf("내용: %s\n",b.getWrite());
        System.out.println("==================================");

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
     */
}