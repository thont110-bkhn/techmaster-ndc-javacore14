package nguyentientho.techmasterndcjavacore14.buoi2;

import java.util.Scanner;

public class Lecture2 {

    public static void main(String[] args) {
//        tamGiacVuong3();
        kimTuThap();
    }

    /**
     * Viết ct in ra màn hình tam giác
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void tamGiacVuong() {
        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++)
                System.out.print("*" + " ");
            System.out.println("");
        }
    }

    /**
     * cũng là tgv nhưng các số trên 1 hàng đc lặp lại
     * 1
     * 22
     * 333
     * 4444
     */
    public static void tamGiacVuong2() {
        int i, j, n;
        System.out.print("Input number of n : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println("");
        }
    }

    /**
     * Cũng là tgv nhưng các số đơn vị của từng phần tử tăng dần lên 1
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */
    public static void tamGiacVuong3() {
        int i, j, n, k = 0;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(++k);
            System.out.println("");
        }
    }

    /** Kim tự tháp với các số trong cùng 1  giống nhau
     *        1
     *       2 2
     *      3 3 3
     *     4 4 4 4
     */
    public static void kimTuThap() {
        int i, j, n, s, x;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        s = n;
        for (i = 1; i <= n; i++) {
            for (x = s; x > 0; x--) {
                System.out.print("*");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }

    /**
     * In ra tam giác Floyd's
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */
    public static void floydTamGiac() {
        int numberOfRows;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        numberOfRows = in.nextInt();
        int number = 1;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    /** in ra hinh kim cương
     *       *
     *      ***
     *     *****
     *    *******
     *   *********
     *  ***********
     * *************
     *  ***********
     *   *********
     *    *******
     *     *****
     *      ***
     *       *
     */
    public static void diamond() {
        int i, j, r;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    /** Tam giác pascal
     *       1
     *      1 1
     *     1 2 1
     *    1 3 3 1
     *   1 4 6 4 1
     */
    public static void pascalTamGiac() {
        int no_row, c = 1, blk, i, j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_row = in.nextInt();
        for (i = 0; i < no_row; i++) {
            for (blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0) c = 1;
                else c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.print("\n");
        }
    }

    /** tam giác ngược
     * ******
     *  *****
     *   ****
     *    ***
     *     **
     *      *
     */
    public static void tamgiacnguoc() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            for (int spc = n - i; spc > 0; spc--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /** tam giác cạnh phải có @
     *       @
     *      @@
     *     @@@
     *    @@@@
     *   @@@@@
     *  @@@@@@
     */
    public static void atamGiac() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int spc = n - i; spc > 0; spc--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    /** diamond number rhombus structure
     *       1
     *      212
     *     32123
     *    4321234
     *   543212345
     *  65432123456
     * 7654321234567
     *  65432123456
     *   543212345
     *    4321234
     *     32123
     *      212
     *       1
     */
    public static void diamondNumberRhombus() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;
        for (int i = 1; i < (n * 2); i++) {
            for (int spc = n - no_of_spaces; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < n) {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }

    /** diamond character rhombus structure
     *       A
     *      ABA
     *     ABCBA
     *    ABCDCBA
     *   ABCDEDCBA
     *  ABCDEFEDCBA
     * ABCDEFGFEDCBA
     *  ABCDEFEDCBA
     *   ABCDEDCBA
     *    ABCDCBA
     *     ABCBA
     *      ABA
     *       A
     */
    public static void diamondCharRhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = sc.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++) {
            for (int spc = n - count2; spc > 0; spc--)
            //print space
            {
                System.out.print(" ");
            }
            if (i < n) {
                count2++;
            } else {
                count2--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(c);//print Character
                if (j < count / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}