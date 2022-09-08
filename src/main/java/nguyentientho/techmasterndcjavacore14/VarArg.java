package nguyentientho.techmasterndcjavacore14;

import java.util.Scanner;

public class VarArg {
    public static void PrintMultipleStrings(int... ints) {
        for(int s : ints ) {
            System.out.println(s);
        }
    }

    public static void main0(String[] args) {
        PrintMultipleStrings(1, 2, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Chuỗi : ");
        String chuoi= scanner.nextLine();

//        StringBuilder sb = new StringBuilder(chuoi);
//        StringBuffer sb2 = new StringBuffer();
//        sb.deleteCharAt(0);
        chuoi = "hung xau trai";
        chuoi = new String("TIEN DEP TRAI");
        String chuoi2 = chuoi.replace(chuoi.charAt(0), (char) 126);
//        System.out.println(sb.toString());
        System.out.println(chuoi2);
    }
}
