package model;

public class BoardDTO {
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


    public boolean equals(Object o){
        if(o instanceof  BoardDTO){
            BoardDTO u = (BoardDTO) o;
            return number == u.number;
        }
        return false;
    }

    public BoardDTO(BoardDTO origin){
        number = origin.number;
        name = origin.name;
        title = origin.title;
        write = origin.write;
    }

    public BoardDTO() {

    }
}
