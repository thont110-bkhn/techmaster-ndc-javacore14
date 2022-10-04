package nguyentientho.techmasterndcjavacore14.research4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise {
    public static void main(String[] args) {
        bai1();
    }

    /** bai 1
     * Viết chương trình Java để kiểm tra xem một chuỗi có chỉ chứa các ký tự là a-z, A-Z và 0-9.
     */
    public static void bai1() {
        Pattern pattern = Pattern.compile("^[\\w]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("ABCDEFabcdef123450");
        Matcher matcher2 = pattern.matcher("SQL");
        Matcher matcher3 = pattern.matcher("Java");
        Matcher matcher4 = pattern.matcher("*&%@#!}{");
        Matcher matcher5 = pattern.matcher("*&%@#!}{");
        Matcher matcher6 = pattern.matcher("techmaster.vn");
        System.out.println("1 - " + matcher.matches());
        System.out.println("2 - " + matcher2.matches());
        System.out.println("3 - " + matcher3.matches());
        System.out.println("4 - " + matcher4.matches());
        System.out.println("5 - " + matcher5.matches());
        System.out.println("6 - " + matcher6.matches());
    }

    /** bai 2
     * Viết chương trình Java khớp với một chuỗi có bắt đầu là 'p' các ktu theo sau là 'q' xhien 0 hoặc nhiều lần.
     */
    public static void bai2() {
        Pattern pattern = Pattern.compile("pq*?");
        Matcher matcher = pattern.matcher("p");
//        Matcher matcher = pattern.matcher("pq");
//        Matcher matcher = pattern.matcher("pqq");
//        Matcher matcher = pattern.matcher("pqr");
//        Matcher matcher = pattern.matcher("prr");
        System.out.println(matcher.matches());
    }

    /** bai 3
     * Viết chương trình Java để tìm chuỗi có các chữ cái thường được nối với nhau bằng dấu gạch dưới _.
     */
    public static void bai3() {
        Pattern pattern = Pattern.compile("^[a-z]+_[a-z]+$");
        Matcher matcher = pattern.matcher("java_exercises");
//        Matcher matcher = pattern.matcher("Java_exercises");
//        Matcher matcher = pattern.matcher("java_Exercises");
//        Matcher matcher = pattern.matcher("Java_Exercises");
        System.out.println(matcher.matches());
    }

    /** bai 4
     * Viết một chương trình Java để tìm chuỗi của một ký tự hoa, theo sau là các ký tự thường.
     */
    public static void bai4() {
        String regexPattern = "[A-Z][a-z]+$";
        System.out.println("Java".matches(regexPattern));
        System.out.println("java".matches(regexPattern));
        System.out.println("javA".matches(regexPattern));
        System.out.println("JAVa".matches(regexPattern));
        System.out.println("Ja".matches(regexPattern));
        System.out.println("aJ".matches(regexPattern));
    }

    /** bai 5
     * Viết một chương trình Java khớp với một chuỗi có 'p' theo sau là bất kỳ ký tự gì, kết thúc bằng 'q'.
     */
    public static void bai5() {
        String regex = "p.*?q$";
        System.out.println(Pattern.matches(regex,"phkuyrt"));
        System.out.println(Pattern.matches(regex,"pq"));
        System.out.println(Pattern.matches(regex,"pccddbbjjjq"));
        System.out.println(Pattern.matches(regex,"Jar"));
        System.out.println(Pattern.matches(regex,"pjhut"));
    }

    public static void bai6() {}
    public static void bai7() {}
    public static void bai8() {}
    public static void bai9() {}
    public static void bai10() {}
    public static void bai11() {}
    public static void bai12() {}
    public static void bai13() {}
    public static void bai14() {}
    public static void bai15() {}
    public static void bai16() {}
}
