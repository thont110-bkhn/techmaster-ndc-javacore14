package nguyentientho.techmasterndcjavacore14.buoi13.treemap;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * b1: in các phần tử của map ra màn hình
 * b2: copy các phần tử của map1 sang map2
 * b3: check key = 2 trong map có tồn tại không
 * b4: check value = "Monday" có trong map hay ko
 * b5: tạo 1 set từ tất cả các key trong map
 * b6: xoá hết các phần tử trong map
 */
public class Explaintion {
    static void treemap() {
        TreeMap<Integer, String> tree_map=new TreeMap<>();
        // Put elements to the map
        tree_map.put(1, "Sunday");
        tree_map.put(2, "Monday");
        tree_map.put(3, "Tuesday");
        tree_map.put(4, "Wednesday");
        tree_map.put(5, "Thursday");
        tree_map.put(6, "Friday");
        tree_map.put(7, "Saturday");

        //b1
        tree_map.entrySet().forEach(e -> System.out.println(e));
        for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        for (Object objectName : tree_map.keySet()) {
            System.out.println(objectName);
            System.out.println(tree_map.get(objectName));
        }
        System.out.println(Arrays.toString(tree_map.entrySet().toArray()));

        //b2:
        TreeMap<Integer,String> tree_map2 = new TreeMap<>();
        tree_map.putAll(tree_map2);
        //b3:
        tree_map.containsKey(2);
        //b4:
        tree_map.containsValue("Monday");
        //b5:
        tree_map.keySet();
        //b6:
        tree_map.clear();
    }

    public static void main(String[] args) {
        treemap();
    }
}
