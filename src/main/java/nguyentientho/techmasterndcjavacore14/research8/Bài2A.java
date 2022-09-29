package nguyentientho.techmasterndcjavacore14.research8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Bài2A {
    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 3, 7, 2, 4};
        int k = 6;
        System.out.print("Original Array: " + Arrays.toString(nums));
        System.out.print("\nValue of k: " + k);
        System.out.print("\nTotal number of continuous subarrays: " + max_SubArray(nums, k));
    }

    public static int max_SubArray(int[] nums, int k) {
        int ctr = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                ctr = ctr + map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ctr;
    }
}
