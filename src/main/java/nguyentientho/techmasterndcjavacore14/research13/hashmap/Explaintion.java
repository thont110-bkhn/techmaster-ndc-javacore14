package nguyentientho.techmasterndcjavacore14.research13.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * b1: Viết chương trình để in ra các phần tử của map
 * b2: tính tổng số phần tử
 * b3: copy các ptu của map1 sang map2 (ko sử dụng method clone)
 * b4: loại bỏ các phần tử khỏi map
 * b5: check xem 1 map có phải là map rỗng hay không
 * b6: shallow copy 1 map
 * b7: check xem 1 map có chứa 1 key cụ thể không
 * b8: lấy tập hợp các value của 1 map
 * b9: lấy value tương ứng của 1 key cụ thể trong map
 * b10: lấy tập hợp các key của 1 map
 * B11: lấy tập hợp các value của 1 map
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
        //b4: hash_map1.clear();
        //b5:
        hash_map1.isEmpty();
        //b6:
        hash_map1.clone();
        //b7
        hash_map1.containsKey("Red");
        //b8
        hash_map1.entrySet();
        //b9:
        hash_map1.get(1);
        //b10:
        hash_map1.keySet();
        //b11:
        hash_map1.values();
    }
}
