package nguyentientho.techmasterndcjavacore14.buoi7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeB7 {
    public static void main(String[] args) {
        bai1();
    }

    /** COLLECTION = ArrayList, LinkedList, HashSet, TreeSet, PriorityQueue, HashMap, TreeMap
     *  Bai1: Viết 1 chương trình java để
     * a) tìm kiếm một phần tử trong danh sách mảng
     * b) sắp xếp một danh sách các phần tử
     * c) copy list 2 sang list 1
     * d) xáo trộn các phần tử trong 1 danh sách
     * e) đảo ngược các phần tử trong danh sách
     * f) lấy danh sách con của danh sách cha
     * g) hoán đổi phần tử thứ 1 (index 0) với phần tử thứ 3 (index 2)
     * h) nối 2 danh sách lại với nhau
     * i) xóa hết các phần tử của ds
     */
    public static void bai1() {
        List<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");
        // a) tìm kiếm 1 phần tử trong danh sách
        if (colorList.contains("Red")) {
            System.out.println("Tìm thấy phần tử");
        } else {
            System.out.println("Không có phần tử trong danh sách");
        }

        // b) sắp xếp một danh sách
        System.out.println("Danh sách trước khi sort = " + Arrays.toString(colorList.toArray()));
        Collections.sort(colorList);
        System.out.println("Danh sách sau khi sort = " + Arrays.toString(colorList.toArray()));

        // c) Copy List2 to List1
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        System.out.println("List1: " + list1);
        List<String> list2 = new ArrayList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println("List2: " + list2);
        // Copy List2 to List1
        Collections.copy(list1, list2);
        // Clone lis2 to List3

        List<String> list3 = (List<String>) ((ArrayList<String>) list2).clone();
        System.out.println("Copy List to List2,\n After copy:");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // d) xáo trộn các phần tử trong 1 danh sách
        Collections.shuffle(colorList);

        // e) đảo ngược các phần tử trong danh sách
        Collections.reverse(colorList);

        // f) lấy danh sách con của danh sách cha
        colorList.subList(0, 3);

        // g) hoán đổi phần tử thứ 1 (index 0) với phần tử thứ 3 (index 2)
        System.out.println("Trước khi hoán đổi = " + Arrays.toString(colorList.toArray()));
        Collections.swap(colorList, 0, 2);
        System.out.println("Sau khi hoán đổi index 0 với index 2 = " + Arrays.toString(colorList.toArray()));

        // h) nối 2 danh sách lại với nhau
        List<String> joinList = new ArrayList<>();
        joinList.addAll(list1);
        joinList.addAll(list2);

        // i) xóa hết các phần tử của ds
        colorList.removeAll(colorList);
        System.out.println("Xóa hết các phần tử của ds = " + Arrays.toString(colorList.toArray()));

        // j) kiểm tra ds có phải ds rỗng ko
        System.out.println("colorList có rỗng hay không = " + colorList.isEmpty());

        // k) Thay thế phần tử thứ 2 bằng 1 phần tử khác
        String replace = "replace";
        colorList.set(1, replace);

        // l) in tất cả phần tử của ds bằng phương thức get


    }
}
