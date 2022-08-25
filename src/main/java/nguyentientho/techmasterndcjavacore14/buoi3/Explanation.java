package nguyentientho.techmasterndcjavacore14.buoi3;

import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Explanation {
    public static void main0(String[] args) {
        bai3();
    }

    public static void main(String[] args) {
    }

    public static void main1(String[] args) {
        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }

    //[Bài 1] Viết chương trình Java để lấy ký tự tại chỉ mục đã cho trong Chuỗi
    public static void bai1() {
        String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results.
        System.out.println("The character at position 0 is " +
                (char)index1);
        System.out.println("The character at position 10 is " +
                (char)index2);
    }

    /**
     * Viết chương trình Java để so sánh một chuỗi đã cho với chuỗi ký tự được chỉ định.
     */
    public static void bai2() {
        String str1 = "example.com", str2 = "Example.com";
        CharSequence cs = "example.com";
        System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
        System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
    }

    /**
     * Viết chương trình Java để kiểm tra xem hai đối tượng String có chứa cùng một dữ liệu hay không.
     */
    public static void bai3() {
            String columnist1 = "Stephen Edwin King";
            String columnist2 = "Walter Winchell";
            String columnist3 = "Mike Royko";

            // Are any of the above Strings equal to one another?
            boolean equals1 = columnist1.equals(columnist2);
            boolean equals2 = columnist1.equals(columnist3);

            // Display the results of the equality checks.
            System.out.println("\"" + columnist1 + "\" equals \"" +
                    columnist2 + "\"? " + equals1);
            System.out.println("\"" + columnist1 + "\" equals \"" +
                    columnist3 + "\"? " + equals2);
    }

    /**
     * Viết chương trình Java để lấy độ dài của một chuỗi cho trước
     */
    public static void bai4() {
        String str = "example.com";
        // Get the length of str.
        int len = str.length();
        System.out.println("The string length of '"+str+"' is: "+len);
    }

    /**
     *  Viết chương trình Java để thay thế một ký tự được chỉ định bằng một ký tự khác
     */
    public static void bai5() {
        String str = "The quick brown fox jumps over the lazy dog.";

        // Replace all the 'd' characters with 'f' characters.
        String new_str = str.replace('d', 'f');

        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }

    /**
     * Viết chương trình Java để kiểm tra xem một chuỗi đã cho có bắt đầu bằng nội dung của chuỗi khác hay không
     */
    public static void bai6() {
        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";

        // The String to check the above two Strings to see
        // if they start with this value (Red).
        String startStr = "Red";

        // Do either of the first two Strings start with startStr?
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        // Display the results of the startsWith calls.
        System.out.println( str1 + " starts with " +
                startStr + "? " + starts1);
        System.out.println(str2 + " starts with " +
                startStr + "? " + starts2);
    }

    /**
     * Viết chương trình Java để lấy một chuỗi con của một chuỗi đã cho nằm giữa hai vị trí xác định
     * vd: old = The quick brown fox jumps over the lazy dog.
     *     new = brown fox jumps
     */
    public static void bai7() {
        String str = "The quick brown fox jumps over the lazy dog.";

        // Get a substring of the above string starting from
        // index 10 and ending at index 26.
        String new_str = str.substring(10, 26);

        // Display the two strings for comparison.
        System.out.println("old = " + str);
        System.out.println("new = " + new_str);
    }

    /**
     * Viết chương trình Java để chuyển tất cả các ký tự trong một chuỗi thành chữ hoa
     * Chuỗi gốc: The Quick BroWn FoX!
     * Chuỗi viết hoa: THE QUICK BROWN FOX!
     */
    public static void bai8() {
        String str = "The Quick BroWn FoX!";

        // Convert the above string to all uppercase.
        String upper_str = str.toUpperCase();

        // Display the two strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + upper_str);
    }

    /**
     * Viết một chương trình Java để cắt bỏ bất kỳ khoảng trắng đầu hoặc cuối từ một chuỗi nhất định
     */
    public static void bai9() {
        String str = " Java Exercises ";

        // Trim the whitespace from the front and back of the
        // String.
        String new_str = str.trim();

        // Display the strings for comparison.
        System.out.println("Original String: " + str);
        System.out.println("New String: " + new_str);
    }

    /**
     * Viết chương trình Java để đảo ngược một chuỗi sử dụng đệ quy
     * Chuỗi đã cho là: Cáo nâu nhảy nhanh
     * Chuỗi theo thứ tự ngược lại là:
     * spmuj xof nworb kciuq ehT
     */
//    public static void bai10(String str1) {
//        if ((str1 == null) || (str1.length() <= 1))
//            System.out.println(str1);
//        else {
//            System.out.print(str1.charAt(str1.length() - 1));
//            bai10(str1.substring(0, str1.length() - 1));
//        }
//    }
//    public static void mainBai10(String[] args) {
//        String str1 = "The quick brown fox jumps";
//        System.out.println("The given string is: " + str1);
//        System.out.println("The string in reverse order is:");
//        Main obj = new Main();
//        obj.bai10(str1);
//    }

    /**
     * Viết chương trình Java để chuyển một Chuỗi đã cho thành int, long, float và double
     * Chuyển đổi chuỗi thành int / Integer:
     * "1323" là int là 1323 và Integer là 1323
     *
     * Chuyển đổi chuỗi thành dài / dài:
     * "13625478965325" dài là 13625478965325 và dài là 13625478965325
     *
     * Chuyển đổi chuỗi thành float / Float:
     * "25.135F" dưới dạng float là 25.135 và như Float là 25.135
     *
     * Chuyển đổi chuỗi thành double / Double:
     * "21,25478254D" như gấp đôi là 21,25478254 và như Đôi là 21,25478254
     * sai
     */
    public static void bai11() {
        String STR_TO_INT = "1323";
        String STR_TO_LONG = "13625478965325";
        String STR_TO_FLOAT = "25.135F";
        String STR_TO_DOUBLE = "21.25478254D";

        System.out.println("Convert String to int/Integer:");
        Integer toInt1 = Integer.valueOf(STR_TO_INT);
        int toInt2 = Integer.parseInt(STR_TO_INT);
        System.out.println("\"" + STR_TO_INT + "\"" + " as int is "
                + toInt1 + " and as Integer is " + toInt2);

        System.out.println("\nConvert String to long/Long:");
        Long toLong1 = Long.valueOf(STR_TO_LONG);
        long toLong2 = Long.parseLong(STR_TO_LONG);
        System.out.println("\"" + STR_TO_LONG + "\"" + " as long is "
                + toLong1 + " and as Long is " + toLong2);
        System.out.println("\nConvert String to float/Float:");
        Float toFloat1 = Float.valueOf(STR_TO_FLOAT);
        float toFloat2 = Float.parseFloat(STR_TO_FLOAT);
        System.out.println("\"" + STR_TO_FLOAT + "\"" + " as float is "
                + toFloat1 + " and as Float is " + toFloat2);

        System.out.println("\nConvert String to double/Double:");
        Double toDouble1 = Double.valueOf(STR_TO_DOUBLE);
        double toDouble2 = Double.parseDouble(STR_TO_DOUBLE);
        System.out.println("\"" + STR_TO_DOUBLE + "\"" + " as double is "
                + toDouble1 + " and as Double is " + toDouble2);
    }

    /**
     * Viết chương trình Java kiểm tra các ký tự của chuỗi thứ hai có trong chuỗi thứ nhất hay không. Trả về true nếu không trả về false
     * Nhập chuỗi đầu tiên:
     *  Java
     * Nhập chuỗi thứ hai:
     *  Ja
     * Kiểm tra chuỗi đầu tiên chứa các chữ cái từ chuỗi thứ hai:
     * thật
     */
    public static boolean bai12(String first_string, String second_string) {
        if (second_string.length() > first_string.length()) return false;
        if (second_string.isEmpty())
            return true;
        for (int i = 0; i < second_string.length(); i++) {
            if (!first_string.contains(String.valueOf(second_string.charAt(i))))
                return false;
        }
        return true;
    }
    public static void mainBai12(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input the first string: ");
        String text = myObj.nextLine();
        System.out.println("Input the second string: ");
        String word = myObj.nextLine();
        System.out.println("Check first string contains letters from the second string:\n" + bai12(text, word));
    }

    /**
     * Viết chương trình Java để lấy ngày hôm nay vào lúc nửa đêm. (0:00:00)
     */
    public static void bai13() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        System.out.println("\n"+cal.getTime()+"\n");
    }

    /**
     * Viết chương trình Java để tính hiệu số giữa hai ngày (năm, tháng, ngày)
     * Difference is 5 years, 5 months and 20 days old
     */
    public static void bai14() {
        LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("\nDifference is %d years, %d months and %d days old\n\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }

    /**
     * Viết chương trình Java để chuyển đổi một chuỗi thành ngày tháng.
     */
    public static void bai15() {
        String string = "May 1, 2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println();
        System.out.println(date);
        System.out.println();
    }

    /**
     * Viết chương trình Java để lấy ngày trước và sau ngày hôm nay 10 ngày.
     */
    public static void bai16() {
        LocalDate today = LocalDate.now();
        System.out.println("\nCurrent Date: "+today);
        System.out.println("10 days before today will be "+today.plusDays(-10));
        System.out.println("10 days after today will be "+today.plusDays(10)+"\n");
    }
//    public static void bai17() {}
//    public static void bai18() {}

    /**
     *  Viết chương trình Java để tạo một chuỗi mới lặp lại mỗi ký tự hai lần từ một chuỗi đã cho
     *  Chuỗi đã cho là: chào mừng
     * Chuỗi mới là: wweellccoommee
     */
    public static void bai19() {
    {
        int l = stng.length();
        String newstring = "";
        for (int i = 0; i < l; i++)
        {
            newstring += stng.substring(i,i+1) + stng.substring(i, i+1);
        }
        return newstring;
    }

    public static void main (String[] args)
    {
        Main m= new Main();
        String str1 =  "welcome";
        System.out.println("The given string is: "+str1);
        System.out.println("The new string is: "+m.repeatAllTwice(str1));
    }
}
    }


    /** Bài 20
     * Viết một chương trình Java để loại bỏ các ký tự trùng lặp trong 1 chuỗi
     * Chuỗi đã cho là: techmaster
     * Sau khi loại bỏ các ký tự trùng lặp, chuỗi mới là: techmasr
     */
    public static void bai20() {
        String str1 = "w3resource";
        System.out.println("The given string is: " + str1);
        System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
    }
    private static String removeDuplicateChars(String sourceStr) {
        char[] arr1 = sourceStr.toCharArray();
        String targetStr = "";
        for (char value: arr1) {
            if (targetStr.indexOf(value) == -1) {
                targetStr += value;
            }
        }
        return targetStr;
    }

    /** Bài 21
     * Viết chương trình java để tìm ký tự chỉ xuất hiện 1 lần trong chuỗi
     * Chuỗi đã cho là: gibblegabbler
     * Ký tự xuất hiện 1 lần trong Chuỗi là: i
     */
    public static void bai21() {
        String str1 = "gibblegabbler";
        System.out.println("The given string is: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is: " + str1.charAt(i));
                break;
            }
        }
    }

    /** Bài 22
     * Viết chương trình Java để tìm ký tự xuất hiện nhiều nhất trong một chuỗi
     * Chuỗi đã cho là: test string
     * ký tự xuất hiện nhiều nhất trong chuỗi là: t
     */
    public static void bai22() {
        static final int N = 256;
        static char MaxOccuringChar(String str1) {
            int ctr[] = new int[N];
            int l = str1.length();
            for (int i = 0; i < l; i++)
                ctr[str1.charAt(i)]++;
            int max = -1;
            char result = ' ';

            for (int i = 0; i < l; i++) {
                if (max < ctr[str1.charAt(i)]) {
                    max = ctr[str1.charAt(i)];
                    result = str1.charAt(i);
                }
            }

            return result;
        }
        public static void main(String[] args) {
            String str1 = "test string";
            System.out.println("The given string is: " + str1);
            System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
        }
    }

//    public static void bai23() {}
//    public static void bai24() {}
//    public static void bai25() {}
//    public static void bai26() {}
}
