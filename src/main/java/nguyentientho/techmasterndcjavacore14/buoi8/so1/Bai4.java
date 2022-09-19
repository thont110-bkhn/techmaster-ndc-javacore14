package nguyentientho.techmasterndcjavacore14.buoi8.so1;

import java.util.Arrays;

public class Bai4 {
    /**
     *  Viết một chương trình Java để kiểm tra xem một mảng các số nguyên có các giá trị âm xen kẽ giữa các giá trị dương hay không.
     *  Ví dụ:
     *   {1, -2, 5, -4, 3, -6} -> true
     *   {1, 2 ,5, 4, 3, 6} -> false
     */
    public static void main(String[] args) {
        int[] nums = {1, -2, 5, -4, 3, -6};
        //int[] nums = {1, 2 ,5, 4, 3, 6};
        System.out.printf("\nOriginal array: " + Arrays.toString(nums));
        boolean result = test(nums);
        System.out.printf("\nCheck the said array of integers alternates between positive and negative values!" + result);
    }

    public static boolean test(int[] nums) {
        for (int n : nums) {
            if (n == 0)
                return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0 && nums[i] > 0) {
                return false;
            } else if (nums[i - 1] < 0 && nums[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
