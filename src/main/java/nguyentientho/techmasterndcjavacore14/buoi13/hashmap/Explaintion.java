package nguyentientho.techmasterndcjavacore14.buoi13.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * b1: Viết chương trình để in ra các phần tử của map
 * b2: tính tổng số phần tử
 * b3: copy các ptu của map1 sang map2 (ko sử dụng method clone)
 * b4: loại bỏ các phần tử khỏi map
 */
public class Explaintion {
    public static void hashmap() {
        HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");

        //b1
        for(Map.Entry x:hash_map1.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }

        //b2: hash_map.size()
        //b3: hash_map2.putAll(hash_map1)
        HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
        hash_map2.putAll(hash_map1);

        //b4:
        hash_map1.clear();

        //b5:
    }
}
