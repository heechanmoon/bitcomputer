package day0118;

import model.UserDTO;

import java.util.Iterator;

public class HashMap implements Map{
    public HashNode[] array = new HashNode[0];

    @Override
    public void put(String key, UserDTO userDTO) {
        if(!contains(key)) {
            HashNode element = new HashNode();
            element.key = key;
            element.value = userDTO;
            HashNode[] temp = new HashNode[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            temp[array.length] = element;
            array = temp;
        }
    }

    @Override
    public UserDTO get(String key) {
        for(int i = 0; i < array.length; i++){
            if(array[i].key == key){
                return array[i].value;
            }
        }
        return null;
    }

    @Override
    public void remove(String key) {
        HashNode[] temp = new HashNode[array.length - 1];
        int index=1;
        for (int i = 0; i < array.length; i++){
            if(array[i].key != key) {
                temp[index - 1] = array[i];
                index++;
            }
        }
        array = temp;
    }

    @Override
    public boolean contains(String key) {
        for (int i = 0; i < array.length; i++){
            if(array[i].key == key){
                return true;
            }
        }
        return false;
    }
}
