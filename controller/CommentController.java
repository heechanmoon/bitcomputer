package controller;

import model.CommentDTO;

import java.util.ArrayList;

public class CommentController {
    private ArrayList<CommentDTO> list;
    private int nextId;
    public CommentController() {
        list = new ArrayList<>();
        nextId = 1;
    }

    public void insert(CommentDTO commentDTO){
        commentDTO.setCommentNumber(nextId++);
        list.add(commentDTO);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public ArrayList<CommentDTO> getList(){
        return list;
    }

    public CommentDTO selectById(int id){
        for(CommentDTO b : list){
            if(b.getCommentNumber() == id){
                return new CommentDTO(b);
            }
        }
        return null;
    }

    public void update(CommentDTO commentDTO){
        list.set(list.indexOf(commentDTO), commentDTO);
    }

    public void delete(int number){
        CommentDTO b = new CommentDTO();
        b.setNumber(number);
        list.remove(b);
    }

    public void delete(CommentDTO commentDTO){
        list.remove(commentDTO);
    }

    public int getCommentNumber(CommentDTO commentDTO){
        int number = list.indexOf(commentDTO);
        return number;
    }

    /*
    public boolean validateUsername(String username){
        if(username.equalsIgnoreCase("X")){
            return false;
        }
        for(CommentDTO u : list){
            if(username.equalsIgnoreCase(u.getNickname())){
                return false;
            }
        }
        return true;
    }

     */

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
