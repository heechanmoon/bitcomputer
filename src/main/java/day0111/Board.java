package day0111;

import util.ScannerUtil;

import java.util.Scanner;

//게시판 만들기 : 제목 작성자 글번호 글내용
public class Board {
    public static final Scanner SCANNER = new Scanner(System.in);
    private String title;
    private String name;
    private int number;
    private String write;

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getWrite(){
        return write;
    }
    public void setWrite(String write){
        this.write = write;
    }

    public void printBoard(){
        System.out.println("게시글 번호: "+number+"번 게시자 이름: "+name);
        System.out.printf("제목: %s\n",title);
        System.out.printf("내용: %s\n", write);
        System.out.println("==================================");
    }

    public void insertBoard(int index){
        String message;

        message = "게시글 제목을 입력해주세요.";
        title = ScannerUtil.nextLine(SCANNER, message);

        message = "게시자의 이름을 입력해주세요.";
        name = ScannerUtil.nextLine(SCANNER, message);

        message = "게시글 내용을 입력해주세요";
        write = ScannerUtil.nextLine(SCANNER, message);

        number = index;
    }

    public boolean equals(Object o){
        if(o instanceof Board){
            Board b = (Board)o;
            return number==b.number;
        }

        return false;
    }
}
