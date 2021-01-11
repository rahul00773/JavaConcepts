package map;

import java.util.HashMap;

public class Test {

    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "abc");
        System.out.println(map.get(null));
    }
    
}
