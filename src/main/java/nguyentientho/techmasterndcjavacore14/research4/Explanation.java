package nguyentientho.techmasterndcjavacore14.research4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Explanation {
    public static void main(String[] args) {
        bai4();
    }

    /**[Bài 0]
     * Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
     * Nhập các phần tử mảng
     * In mảng ra màn hình
     * Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử
     * VD: [1,4,7,6,2,3] -> [1,5,7,7,3,3]
     */
    public static void bai0() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int s = scanner.nextInt();
        int[] arrayInt = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.println("nhập số phần tử thứ " + i + ":");
            arrayInt[i] = scanner.nextInt();
        }
    }

    /**[Bài 1]
     * Viết chương trình Java để tính giá trị trung bình của các phần tử mảng.
     * numbers = new int[]{20, 30, 25, 35, -16, 60, -100}
     */
    public static void bai1() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }

    /**[Bài 2]
     * Chèn (không phải là thay thế) 1 phần tử có value = 5 vào vị trí trí thứ 3 của mảng sau
     * my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}
     */
    public static void bai2() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Insert an element in 3rd position of the array (index->2, value->5)
        int Index_position = 2;
        int newValue    = 5;

        System.out.println("Original Array : "+ Arrays.toString(my_array));

        for(int i=my_array.length-1; i > Index_position; i--){
            my_array[i] = my_array[i-1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
    }

    /**[Bài 3]
     * Viết chương trình Java để tìm các phần tử trong mảng 1 xuất hiện tại mảng thứ 2 (giá trị chuỗi) in các phần tử đó ra
     * String[] array1 = {“Python”, “JAVA”, “PHP”, “C#”, “C++”, “SQL”};
     * String[] array2 = {“MySQL”, “SQL”, “SQLite”, “Oracle”, “PostgreSQL”, “DB2”, “JAVA”};
     */
    public static void bai3() {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    set.add(array1[i]);
                }
            }
        }
        System.out.println("Common element : "+(set));     //OUTPUT : [THREE, FOUR, FIVE]
    }

    /**[Bài 4]
     * Viết chương trình Java để tính giá trị trung bình của một mảng các số nguyên trừ giá trị lớn nhất và nhỏ nhất
     */
    public static void bai4() {
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        int max = array_nums[0];
        int min = array_nums[0];
        float sum = array_nums[0];
        for(int i = 1; i < array_nums.length; i++)
        {
            sum  += array_nums[i];
            if(array_nums[i] > max)
                max = array_nums[i];
            else if(array_nums[i] < min)
                min = array_nums[i];
        }
        float x = ((sum-max-min) / (array_nums.length - 2));
        System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %.2f",x);
        System.out.print("\n");
    }
}
