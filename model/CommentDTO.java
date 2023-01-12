package model;

public class CommentDTO {

    private String Nickname;
    private int writerId;
    private int number;
    private String write;

    private int commentNumber;

    public int getWriterId() {
        return writerId;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
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

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public boolean equals(Object o){
        if(o instanceof  CommentDTO){
            CommentDTO u = (CommentDTO) o;
            return number == u.number;
        }
        return false;
    }

    public CommentDTO(CommentDTO origin){
        number = origin.number;
        Nickname = origin.Nickname;
        writerId = origin.writerId;
        write = origin.write;
    }

    public CommentDTO() {

    }
}
