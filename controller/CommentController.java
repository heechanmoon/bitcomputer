package controller;

import model.BoardDTO;
import model.CommentDTO;

import java.util.ArrayList;

public class CommentController {
    private ArrayList<CommentDTO> list;
    private int nextId = 0;
    private int nextIndex;
    public CommentController() {
        list = new ArrayList<>();
        nextIndex = 1;
    }

    public void insert(CommentDTO commentDTO){
        for(CommentDTO d : list){
            if(d.getNumber()==commentDTO.getNumber()){
                nextId = d.getCommentNumber();
            }
        }
        commentDTO.setCommentNumber(nextId+1);
        commentDTO.setNextIndex(nextIndex++);
        list.add(commentDTO);
        nextId = 0;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public ArrayList<CommentDTO> getList(){
        return list;
    }

    public CommentDTO selectById(int boardNumber, int commentNumber){
        for(CommentDTO b : list){
            if(b.getCommentNumber() == commentNumber && b.getNumber() == boardNumber){
                return new CommentDTO(b);
            }
        }
        return null;
    }

    public void update(int nextIndex, CommentDTO commentDTO){
        int updateIndex = -1;
        for(CommentDTO b : list){
            if(b.getNextIndex() == nextIndex){
                updateIndex = b.getNextIndex()-1;
            }
        }
        list.set(updateIndex, commentDTO);
    }

    public void delete(int nextIndex){
        int deleteIndex = -1;
        for(CommentDTO b : list){
            if(b.getNextIndex() == nextIndex){
                deleteIndex = b.getNextIndex()-1;
            }
        }
        list.remove(deleteIndex);
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
