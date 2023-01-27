package model;

import java.util.Date;

public class BoardDTO implements Comparable<BoardDTO>{
    private String title;
    private String Nickname;
    private int writerId;
    private int number;
    private int boardNumber;
    private String write;

    private Date enrtyDate;
    private Date modifyDate;

    public Date getEnrtyDate() {
        return enrtyDate;
    }

    public void setEnrtyDate(Date enrtyDate) {
        this.enrtyDate = enrtyDate;
    }
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    public int getWriterId() {
        return writerId;
    }
    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }
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
    public String getNickname(){
        return Nickname;
    }
    public void setNickname(String nickname){
        this.Nickname = nickname;
    }
    public String getWrite(){
        return write;
    }
    public void setWrite(String write){
        this.write = write;
    }

    public int compareTo(BoardDTO b){
        return this.number - b.number;
    }

    public boolean equals(Object o){
        if(o instanceof  BoardDTO){
            BoardDTO u = (BoardDTO) o;
            return number == u.number;
        }
        return false;
    }

    public BoardDTO(BoardDTO origin){
        number = origin.number;
        Nickname = origin.Nickname;
        writerId = origin.writerId;
        title = origin.title;
        write = origin.write;
        boardNumber = origin.boardNumber;
        enrtyDate = origin.enrtyDate;
        modifyDate = origin.modifyDate;
    }

    public BoardDTO() {

    }
}
