package controller;

import model.BoardDTO;

import java.util.ArrayList;
import java.util.Date;

public class BoardController {
    private ArrayList<BoardDTO> list;
    private int nextId;
    public BoardController() {
        list = new ArrayList<>();
        nextId = 1;

        for(int i = 1; i <= 4; i++){
            BoardDTO b = new BoardDTO();
            b.setTitle("제목 "+i);
            b.setWriterId(1);
            b.setNickname("일반회원1");
            b.setWrite(i + "번째 게시글의 내용입니다.");

            insert(b);
        }
    }

    public void insert(BoardDTO boardDTO){
        boardDTO.setNumber(nextId++);
        boardDTO.setEnrtyDate(new Date());
        boardDTO.setModifyDate(new Date());
        list.add(boardDTO);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public ArrayList<BoardDTO> getList(){
        return list;
    }

    public BoardDTO selectById(int id){
        for(BoardDTO b : list){
            if(b.getNumber() == id){
                return new BoardDTO(b);
            }
        }
        return null;
    }

    public void update(BoardDTO boardDTO){
        boardDTO.setModifyDate(new Date());
        list.set(list.indexOf(boardDTO), boardDTO);
    }

    public void delete(int number){
        BoardDTO b = new BoardDTO();
        b.setNumber(number);
        list.remove(b);
    }

    public boolean validateUsername(String username){
        if(username.equalsIgnoreCase("X")){
            return false;
        }
        for(BoardDTO u : list){
            if(username.equalsIgnoreCase(u.getNickname())){
                return false;
            }
        }
        return true;
    }

    /*
    public UserDTO auth(String username, String password){
        for(UserDTO u : list){
            if(username.equalsIgnoreCase(u.getUsername()) && password.equals(u.getPassword())){
                return new UserDTO(u);
            }
        }

        return null;
    }
    */
}
