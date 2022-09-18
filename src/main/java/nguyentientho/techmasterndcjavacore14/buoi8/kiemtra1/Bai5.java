package nguyentientho.techmasterndcjavacore14.buoi8.kiemtra1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        String input = "Hello world!\n hung + nam = nam than -> true";
        Scanner scanner = new Scanner(input);

        System.out.println(scanner.next());

        System.out.println(scanner.nextLine());

        scanner.close();
    }
}
