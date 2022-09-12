package nguyentientho.techmasterndcjavacore14.buoi8.kiemtra1;

public class Bai3 {
    /**
     * Viết 1 chương trình java để check 1 chuỗi số có phải là số điện thoại tại việt nam không sử dụng Regex
     * ví dụ: 0399390500
     */

    public static void main(String[] args) {
        String text ="0399390500";
        System.out.println("Original Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="(0)34567890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="0345@7890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="A34567890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="134567890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="0-456-7890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="(0399390500)";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="0)234567890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="045678901";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="(0)234567890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="(0)-4567890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="0";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="0-3456-7890";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
        text ="0-4567";
        System.out.println("\nOriginal Phone number: "+text);
        System.out.println("Check the said Phone number is true or not! "+validate(text));
    }
    public static Boolean validate(String text) {
        String pattern = "(84|0)([0-9]{9})";
        return text.matches(pattern);
    }
}
