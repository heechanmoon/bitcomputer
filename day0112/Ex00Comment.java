package day0112;

import viewer.BoardViewer;
import viewer.CommentViewer;
import viewer.UserViewer;
import java.util.Scanner;

public class Ex00Comment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BoardViewer boardViewer = new BoardViewer(scanner);
        UserViewer userViewer = new UserViewer(scanner);
        CommentViewer commentViewer = new CommentViewer(scanner);

        userViewer.setBoardViewer(boardViewer);
        boardViewer.setUserViewer(userViewer);
        boardViewer.setCommentViewer(commentViewer);

        userViewer.showIndex();
    }
}