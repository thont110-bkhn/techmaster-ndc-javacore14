package nguyentientho.techmasterndcjavacore14.research1;

import java.util.Scanner;

public class ExplanationB1 {

    public static void main(String[] args) {
    }

    /** [Bài 1]
     * Cho đoạn code dưới đây:
     *      int i = 10;
     *      int n = i++%5;
     * a. Hãy in ra giá trị cuối cùng của 2 biến i và n.
     * b. Nếu thay phép toán tăng i++ (postfix increment operator) bằng ++i (prefix increment operator) thì giá trị
     * cuối cùng của i và n là bao nhiêu?
     */
    public static void bai1() {
        int i = 10;
        int n = i++%5;
        System.out.println("i = " + i);
        System.out.println("n = " + n);

        i = 10;
        n = ++i%5;
        System.out.println("i = " + i);
        System.out.println("n = " + n);
    }

    /** [Bài 2] Viết chương trình chuyển đổi từ độ F sang độ C. */
    public static void bai2() {
        System.out.println("~~~Fahrenheit to Celsius converter~~~");
        System.out.print("Fahrenheit: ");
        Scanner scan = new Scanner (System.in);
        float fah = scan.nextFloat();
        float cel = (fah - 32)*5/9;
        System.out.println("Celsius: " + cel);
    }

    /** [Bài 3]
     * Cho đoạn code sau:
     *      double d = 9 / 5;
     * System.out.println(d);
     * Giá trị của d được in ra là bao nhiêu ? Hãy sửa code để d có giá trị là 1.8
     */
    public static void bai3() {
        double d = 9 / 5;
        System.out.println(d);

        d= 9/5F;
        System.out.println(d);
    }

    /** [Bài 4]
     * Viết chương trình lấy 1 số nguyên bất kỳ trong khoảng từ 0 đến 1000 và tính tổng các chữ số của nó?
     * VD: Tổng các chữ số của số 1000 = 1;
     */
    public static void bai4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Part 4: Insert the number:");
        int rd = input.nextInt();
        int rds = 0;
        while (rd > 0) {
            int digit = rd % 10;
            rds = rds + digit;
            rd = rd / 10;
        }
        System.out.println("Sum of the Digits of the number generated: " + rds);

    }

    /** [Bài 5]
     * Viết chương trình Java để chấp nhận hai số nguyên và trả về true nếu một trong hai số nguyên là 10 hoặc
     * nếu tổng hoặc hiệu của chúng là 10.
     */
    public static boolean bai5(int p, int q) {
        return (p == 10 || q == 10 || (p + q) == 10 || Math.abs(p - q) == 10);
    }

    /** [Bài 6]
     * Viết chương trình Java để tính chỉ số khối cơ thể (BMI)?
     * Inline Math `Công thức BMI = Cân nặng / (chiều cao)^2`
     */
    public static double bai6(int weigh, float height) {
        return weigh / Math.pow(height, 2);
    }

    /** [Bài 7]
     * Viết chương trình java in ra thời gian hiện tại:
     * Sử dụng hàm `System.currentTimeMillis()` để lấy ra thời gian hiện tại của hệ thống dưới dạng millisecond;
     */
    public static void bai7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    /** [Bài 8]
     * Viết chương trình Java để ngắt một số nguyên có 6 chữ số thành một dãy các chữ số riêng lẻ:
     * VD: đầu vào 123456
     * đầu ra: 1 2 3 4 5 6
     */
    public static void bai8() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }

    /** [Bài 9]
     * Viết chương trình Java để lấy số thập phân tiếp theo liền kề theo hướng nhỏ hơn hoặc lớn hơn từ một số float/double cho trước.
     * Sử dụng lớp Math
     * vd: số 2.0F có số nhỏ hơn 1.99999999999999998 và số lớn hơn 2.00000000000004
     */
    public static void bai9() {
        float fn = 0.9f;
        System.out.println("\nInitial floating number: " + fn);
        float next_down_fn = Math.nextDown(fn);
        float next_up_fn = Math.nextUp(fn);
        System.out.println("Float " + fn + " next down is " + next_down_fn);
        System.out.println("Float " + fn + " next up is " + next_up_fn);
        double dn = 5.2d;
        System.out.println("\nInitial double number: " + dn);
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);
    }

    /** [Bài 10]
     * Viết chương trình Java để tạo số nguyên ngẫu nhiên trong phạm vi từ 2 số cho trước.
     * VD: số bắt đầu = 5, số kết thúc = 25
     * Số ngẫu nhiên nhận được = 10
     */
    public static void bai10() {
        Scanner sc = new Scanner( System.in );
        System.out.print("Input the starting number of the range: ");
        int rsnum = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int renum = sc.nextInt();
        int random_num = rsnum + (int)(Math.random() * (Math.abs(renum - rsnum) + 1));
        System.out.println(random_num);
    }

    /** [Bài 11]
     * @input: 1 year = 365 * 1 day = 24 hour = 1440 minute = 86400 second
     * Viết chương trình Java chuyển đầu vào thành số giờ và số năm:
     * a. Đầu vào là số giờ
     * b. Đầu vào là số phút.
     * c. Đầu vào là số giây.
     * VD: nhập đầu vào: 24 giờ, 1440 phút, 86400 giây
     * kết quả: 1 ngày, 0 năm
     */
    public static void bai11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of hour: ");
        double hours = input.nextDouble();
        System.out.print("Input the number of minutes: ");
        double minutes = input.nextDouble();
        System.out.print("Input the number of second: ");
        double seconds = input.nextDouble();

        // b1:
        double hourInYear = 24 * 365;
        double minuteInYear = 60 * 24 * 365;
        double secondInYear = 60 * 60 * 24 * 365;

        //b2: lấy input
        int hour2Day = (int) (hours / 24);
        long hour2Year = (long) (hours / hourInYear);

        int minute2Day = (int) (minutes / 60 / 24 ) % 365;
        long minute2Year = (long) (minutes / minuteInYear);

        int second2Day = (int) (seconds / 60 / 60 / 24) % 365;
        long second2Year = (long) (seconds / secondInYear);

        System.out.println((int) hours + " hours is approximately " + hour2Year + " years and " + hour2Day + " days");
        System.out.println((int) minutes + " minutes is approximately " + minute2Year + " years and " + minute2Day + " days");
        System.out.println((int) seconds + " seconds is approximately " + second2Year + " years and " + second2Day + " days");
    }
}
