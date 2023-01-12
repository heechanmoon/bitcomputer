package model;

public class BoardDTO {
    private String title;
    private String Nickname;
    private int writerId;
    private int number;

    public int getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    private int boardNumber;
    private String write;

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
    }

    public BoardDTO() {

    }
}
