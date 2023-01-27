package day0118;

import model.UserDTO;

public class Ex03Map {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        UserDTO u = new UserDTO();
        u.setId(1);
        u.setUsername("U1");
        u.setNickname("사용자"+1);
        if(!map.contains(u.getUsername())){
            map.put(u.getUsername(), u);
        }

        UserDTO u2 = new UserDTO();
        u2.setId(2);
        u2.setUsername("U2");
        u2.setNickname("사용자"+2);
        if(!map.contains(u2.getUsername())){
            map.put(u2.getUsername(), u2);
        }

        UserDTO u3 = new UserDTO();
        u3.setId(3);
        u3.setUsername("U3");
        u3.setNickname("사용자"+3);
        if(!map.contains(u3.getUsername())){
            map.put(u3.getUsername(), u3);
        }

        UserDTO u4 = new UserDTO();
        u4.setId(4);
        u4.setUsername("U4");
        u4.setNickname("사용자"+4);
        if(!map.contains(u4.getUsername())){
            map.put(u4.getUsername(), u4);
        }

        System.out.println(map.get("U1"));
        System.out.println(map.get("U2"));
        System.out.println(map.get("U3"));
        System.out.println(map.get("U4")+"\n");

        map.remove("U2");
        map.remove("U3");

        System.out.println(map.get("U1"));
        System.out.println(map.get("U2"));
        System.out.println(map.get("U3"));
        System.out.println(map.get("U4"));
    }
}
