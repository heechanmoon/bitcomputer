package day0118;

import model.UserDTO;

public interface Map {
    public void put(String key, UserDTO userDTO);
    public UserDTO get(String key);
    public void remove(String key);
    public boolean contains(String key);
}
