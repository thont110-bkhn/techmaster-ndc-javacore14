package nguyentientho.techmasterndcjavacore14.research8;

import java.util.regex.Pattern;

public class Bai1 {
    /** Bài 1:
     * Viết một phương thức Java để kiểm tra xem mọi chữ số của một số nguyên dương đã cho có phải là số chẵn hay không.
     * Trả về true nếu mọi chữ số là chẵn, ngược lại là false.
     * Ví dụ:
     * (8642)->true
     * (123)->false
     * (200)->true
     */
    public static void main(String[] args) {
        System.out.println(checkDigitRegex(24680428));
    }

    public static boolean checkEvenDigit(int n){
        while(n != 0){
            if((n % 10) % 2 != 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean checkDigitRegex(int input){
        Pattern pattern = Pattern.compile("[02468]*");
        String str = String.valueOf(input);
        return str.matches(String.valueOf(pattern));
    }
}
