package nguyentientho.techmasterndcjavacore14.research8;

import java.util.Arrays;

public class Bai1A {
    /** Bài 1A
     *  Viết chương trình Java để tìm các số phần tử trong mảng lớn hơn giá trị trung bình của các số của một mảng cho trước.
     *  InputArray = [1, 4, 17, 7, 25, 3, 100]
     *  Ví dụ:
     *  Số trung bình = 22
     *  Các số lớn hơn số trung bình = 25, 100
     */
    public static void main(String[] args) {
        Integer nums[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        double average = sum / nums.length;
        System.out.println("The average of the said array is: " + average);
        System.out.println("The numbers in the said array that are greater than the average are: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) {
                System.out.println(nums[i]);
            }
        }
    }
}