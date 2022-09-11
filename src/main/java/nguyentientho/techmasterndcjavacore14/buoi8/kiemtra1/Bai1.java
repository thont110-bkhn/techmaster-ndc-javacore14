package nguyentientho.techmasterndcjavacore14.buoi8.kiemtra1;

public class Bai1 {
    /**
     * Viết một phương thức Java để kiểm tra xem tất cả các ký tự trong một chuỗi đã cho có phải là nguyên âm
     * (u, e, o, a, i) hay không. Trả về true nếu mỗi ký tự của chuỗi là một nguyên âm, nếu không thì trả về false
     * AIEEE -> true
     * IAO -> true
     * Java -> false
     * Python -> false
     */
    public static void main(String[] args) {
        System.out.println(vowelCheck("AIEEE")
                + "\n"
                + vowelCheck("IAOOOAAIIIUUEEEIII")
                + "\n"
                + vowelCheck("Javaaa"));
        char a = 65;
        System.out.println(a);
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
}
