package nguyentientho.techmasterndcjavacore14;

import nguyentientho.techmasterndcjavacore14.buoi10.MethodInfo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class Javacore14App {

//    public static void main0(String[] args) {
//        String chuoi;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập Chuỗi : ");
//        chuoi= scanner.nextLine();
//        StringBuilder sb = new StringBuilder(chuoi);
//        sb.deleteCharAt(0);
//        System.out.println(sb.toString());
//    }

    public static void main0(String[] args) {
        for (var i = 1; i <= 100; i++) {
            if (i % 3 == 0) { // nếu i chia hết cho 3
                System.out.println("Fizz"); // thì in Fizz
            }
            else if (i % 5 == 0) { // nếu i chia hết cho 5
                System.out.println("Buzz"); // thì in Buzz
            }
            else if ((i % 3 != 0) && (i % 5 != 0)) { // nếu không chia hết cho cả 3 và 5
                System.out.println(i); // thì in giá trị của i
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
        }
    }

    @MethodInfo(date = "", comments = "")
    public static void main1(String[] args) {
        for (var i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 != 0)) { // nếu chỉ chia hết cho 3 nhưng không chia hết cho 5
                System.out.println("Fizz"); // thì in Fizz
            }

            if ((i % 3 != 0) && (i % 5 == 0)) { // nếu chỉ chia hết cho 5 nhưng không chia hết cho 3
                System.out.println("Buzz"); // thì in Buzz
            }

            if ((i % 3 == 0) && (i % 5 == 0)) { // nếu chia hết cho cả 3 và 5
                System.out.println("FizzBuzz"); // thì in FizzBuzz
            }

            if ((i % 3 != 0) && (i % 5 != 0)) { // nếu không chia hết cho cả 3 và 5
                System.out.println(i); // thì in giá trị của i
            }
        }
    }

    public static void main2(String[] args) {
        for (var i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // nếu chia hết cho cả 3 và 5
                System.out.println("'FizzBuzz"); // thì in FizzBuzz
            } else if (i % 3 == 0) { // nếu chỉ chia hết cho 3
                System.out.println("Fizz"); // thì in Fizz
            } else if (i % 5 == 0) { //nếu chỉ chia hết cho 5
                System.out.println("Buzz"); // thì in Buzz
            } else { // trong trường hợp còn lại thì in giá trị của i
                System.out.println(i);
            }
        }
    }

    public static void main3(String[] args) {
        for (var i = 1; i <= 100; i++) {
            if ((i % 3 == 0)) {
                if (i % 5 == 0) {
                    System.out.println("'FizzBuzz"); // thì in FizzBuzz
                } else System.out.println("'Fizz"); // thì in Fizz
            }
            if (i % 5 == 0) {
                System.out.println("'Buzz"); // thì in Fizz
            } else { // trong trường hợp còn lại thì in giá trị của i
                System.out.println(i);
            }
        }
    }

    public static void main4(String[] args) {
        for (var i = 1; i <= 100; i++) {
            String output = "";
            if(i % 3 == 0) output += "Fizz";
            if(i % 5 == 0) output += "Buzz";
            System.out.println(output.isEmpty() ? output : i);
        }
    }

    public static void main5(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main6(String[] args) {
        for (int i = 1; i<=6; i++){
            for(int j =1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void lapLaiKiTu(String ipString) {
        char[] chars = new char[2*ipString.length()];
        for (int i=0; i<2*ipString.length(); i+=2) {
        chars[i] = ipString.charAt(i/2);
        }
        for (int i=0; i<2*ipString.length(); i+=2){
            chars[i+1] = ipString.charAt(i/2);
        }
        System.out.println(String.valueOf(chars));

    }

    public static void bokitulaplai(String str){
        for (int i = 0; i<str.length(); i++) {
            int count = 0;
            for (int j = 0; j<i; j++) {
                if (str.charAt(j) == str.charAt(i)) count++;
            }
            if (count == 0) System.out.print(str.charAt(i));
        }
    }

    public static void ex4(String string) {
        int max=0, result=0;
        int n = string.length();
        int[] count = new int[n];
        for(int i = 0; i<n;i++)
            count[i]=0;

        int counttmp=0;
        for (int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++) {
                if (string.charAt(i) == string.charAt(j))
                    count[i]++;
                if(counttmp<count[i]){
                    counttmp=count[i];
                }
            }
        }
        for(int i=0;i<n;i++){
            if(count[i]==counttmp){
                System.out.println(string.charAt(i)+"  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra : ");
        String str = sc.nextLine();
        char[] arrString = new char[]{'u','e','o','a','i'};
        boolean exist=true;
        char[] arrChar = str.toCharArray();
        int count =0;
        for (char s : arrString) {
            for (char c1 : arrChar) {
                if(c1==s){
                    count++;
                    break;
                }
            }
        }
        if(count==arrChar.length){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
