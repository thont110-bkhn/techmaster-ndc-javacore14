package nguyentientho.techmasterndcjavacore14.buoi8.kiemtra1;

public class Bai2 {
    /** Bài 2:
     * Viết một phương thức Java để kiểm tra xem tất cả các ký tự trong một chuỗi đã cho có phải là nguyên âm
     * (u, e, o, a, i) hay không. Trả về true nếu mỗi ký tự của chuỗi là một nguyên âm, nếu không thì trả về false
     * AIEEE -> true
     * IAO -> true
     * Java -> false
     * Python -> false
     */
    public static void main(String[] args) {
        System.out.println(vowelCheck2("AIEEE")
                + "\n"
                + vowelCheck2("IAOAaie")
                + "\n"
                + vowelCheck2("Javaaa"));
    }

    public static boolean vowelCheck(String input) {
        String vowels = "aeiou";
        String template = input.toLowerCase();
        for (int i = 0; i < template.length(); i++) {
            if (vowels.indexOf(template.charAt(i)) == -1)
                return false;
        }
        return true;
    }

    public static boolean vowelCheck2(String str) {
        boolean result = false;
        String input = str.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                result = true;
            } else return false;
        }
        return result;
    }
}
