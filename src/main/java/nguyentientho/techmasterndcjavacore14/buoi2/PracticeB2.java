package nguyentientho.techmasterndcjavacore14.buoi2;


import java.util.Scanner;

public class PracticeB2 {
    /**
     * Viết chương trình tạo hai biến kiểu int number và randomNumber với:
     *
     * number được nhập vào từ bàn phím
     * randomNumber được sinh ngẫu nhiên từ 1 đến 100
     * So sánh hai số với nhau xem chúng có bằng nhau không sử dụng toán tử 3 ngôi
     */
    public static void compareNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập number: ");
        int number = scanner.nextInt();
        System.out.println("Nhập randomNumber: ");
        int randomNumber = scanner.nextInt();
    }
}
