package nguyentientho.techmasterndcjavacore14.research9;


import java.util.*;

public class Collection {
    /** Hashset
     * Viết 1 chương trình java để:
     * 1) Lặp và in ra tất cả các phần tử của hashset
     * 2) Tính tổng số phần tử của hashset
     * 3) Xóa tất cả các phần tử trong hashset
     * 4) check 1 hashset có phải là hashset rỗng hay không
     * 5) Nhân bản hashset đang có
     * 6) Chuyển đổi 1 hashset thành 1 mảng
     * 7) Chuyển đổi 1 hashset thành 1 treeset
     * 8) Chuyển đổi 1 hashset thành 1 arraylist
     * 9) So sánh các phần tử của hashset đầu tiên với hashset thứ 2
     * 10) so sánh 2 hashset và giữ lại các phần tử giống nhau giữa 2 hashset
     */
    public static void bai2() {
//        Set<Day> numSet = new HashSet<>();
        TreeSet<Day> tree_set = new TreeSet<>(new DayCompare());
//        Set<Day> numSet = new LinkedHashSet<>();
        tree_set.add(new Day(2));
        tree_set.add(new Day(3));
        tree_set.add(new Day(5));
        tree_set.add(new Day(4));
        tree_set.add(new Day(1));
        System.out.println(tree_set.toString());
//        Iterator iterator = numSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next() + " ");
//        }
//        h_set.size();
//        h_set.removeAll(h_set);
//        h_set.isEmpty();
//
//        HashSet<String> new_h_set = new HashSet <String> ();
//        new_h_set = (HashSet)h_set.clone();
//        System.out.println("Cloned Hash Set: " + new_h_set);
//
//        String[] new_array = new String[h_set.size()];
//        h_set.toArray(new_array);
//
//        Set<String> tree_set = new TreeSet<String>(new_h_set);
//        List<String> list = new ArrayList<String>(new_h_set);

        //comparison output in hash set
        HashSet<String>result_set = new HashSet<String>();
        for (Day e : tree_set){
            System.out.println(tree_set.contains(e) ? "Yes" : "No");
        }

//        h_set1.retainAll(h_set2);
    }

    public static void main(String[] args) {
        bai2();
    }
}
