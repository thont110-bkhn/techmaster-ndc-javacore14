package nguyentientho.techmasterndcjavacore14.research3;

import java.util.Scanner;

public class ExplanationB3 {
    public static void main(String[] args) {
//        bai4();
        System.out.println("/*------------ex5---------*/");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi :");
        String str = scanner.nextLine();
        String reverse=" ",reversal=" ";
        int space=0;
        for(int i =0;i< str.length();i++){
            reverse =  str.charAt(i)+reverse; //
        }

        for (int i =0 ;i<reverse.length();i++){
            if(reverse.charAt(i)==' ')
            {
                String k = reverse.substring(space,i);
                String kl="";
                for (int j= 0; j < k.length();j++){
                    kl = k.charAt(j)+ kl;
                }
                reversal = reversal+kl;
                reversal =  reversal+" ";
                space = i+1;
            }
        }
        System.out.println("chuỗi sau khi đảo là:"+reversal.substring(1));
    }

    /** Bài 1
     *  Viết chương trình Java để tạo một chuỗi mới lặp lại mỗi ký tự hai lần từ một chuỗi đã cho
     *  Chuỗi đã cho là: chào mừng
     * Chuỗi mới là: wweellccoommee
     */
    public static void bai1() {
        String str1 = "welcome";
        int l = str1.length();
        String newstring = "";
        for (int i = 0; i < l; i++) {
//            newstring += str1.substring(i, i + 1) + str1.substring(i, i + 1);
        newstring+= str1.charAt(i);
        newstring+= str1.charAt(i);
        }
        System.out.println("The given string is: " + str1);
        System.out.println("The new string is: " + newstring);
    }

    /** Bài 2
     * Viết một chương trình Java để loại bỏ các ký tự trùng lặp trong 1 chuỗi
     * Chuỗi đã cho là: techmaster
     * Sau khi loại bỏ các ký tự trùng lặp, chuỗi mới là: techmasr
     */
    public static void bai2() {
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

    /** Bài 3
     * Viết chương trình java để tìm ký tự chỉ xuất hiện 1 lần trong chuỗi
     * Chuỗi đã cho là: gibblegabbler
     * Ký tự xuất hiện 1 lần trong Chuỗi là: i
     */
    public static void bai3() {
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

    /** Bài 4
     * Viết chương trình Java để tìm ký tự xuất hiện nhiều nhất trong một chuỗi
     * Chuỗi đã cho là: test string
     * ký tự xuất hiện nhiều nhất trong chuỗi là: t
     */
    public static void bai4() {
        String str1 = "test string";
        int N = 256;
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
        System.out.println("The given string is: " + str1);
        System.out.println("Max occurring character in the given string is: " + result);
    }

    /** Bài 5
     * Viết chương trình Java để đảo ngược các từ (không phải đảo ngược các chữ cái) trong một chuỗi cho trước
     * Chuỗi cho trước: Reverse words in a given string
     * Chuỗi được đảo ngược các từ: string given a in words Reverse
     */
    public static void bai5() {
        String str1 = "Reverse words in a given string";
        StringBuilder sb = new StringBuilder(str1);
        String StrRev = sb.reverse().toString();

        String[] words = StrRev.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (String tmp : words) {
            sb = new StringBuilder(tmp);
            reverse.append(sb.reverse() + " ");
        }
        reverse.deleteCharAt(reverse.length() - 1);
        System.out.println("The given string is: " + str1);
        System.out.println("The new string after reversed the words: " + reverse);

    }
}
