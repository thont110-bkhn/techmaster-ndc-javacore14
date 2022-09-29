package nguyentientho.techmasterndcjavacore14.research1;

public class Remind {

    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số a = ");
////        double a = sc.nextDouble();
//        System.out.println(2.3D - Math.pow(10,-5));
//        System.out.println(2.3D + Math.pow(10,-5));
////        System.out.println("số liền kề trước: " + (a - Math.pow(10,-5)));
////        System.out.println("số liền kề sau: " + (a + Math.pow(10,-5)));
//    }

    public static void main(String[] args) {
//        int init = 10;
//        System.out.println((int)(Math.random() * 100));
//        System.out.println(new Random().nextInt(100));

/*        for (var i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // nếu chia hết cho cả 3 và 5
                System.out.println("FizzBuzz"); // thì in FizzBuzz
            }
            if (i % 3 == 0) { // nếu chỉ chia hết cho 3
                System.out.println("Fizz");  // thì in Fizz
            }
            if (i % 5 == 0) { //nếu chỉ chia hết cho 5
                System.out.println("Buzz");  // thì in Buzz
            }
            else { // trong trường hợp còn lại thì in giá trị của i
                System.out.println(i);
            }
        }*/

/*        for (var i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // nếu chia hết cho cả 3 và 5
                System.out.println("FizzBuzz"); // thì in FizzBuzz
            } else if (i % 3 == 0) { // nếu chỉ chia hết cho 3
                System.out.println("Fizz");  // thì in Fizz
            } else if (i % 5 == 0) { //nếu chỉ chia hết cho 5
                System.out.println("Buzz");  // thì in Buzz
            } else { // trong trường hợp còn lại thì in giá trị của i
                System.out.println(i);
            }
        }*/

        for (int i = 1; i <= 100; i++) {
            String out = "";
            if  (i % 3 == 0) out += "Fizz";
            if  (i % 5 == 0) out += "Buzz";
            System.out.println(out.trim().isEmpty() ? i : out);
        }
    }

/*    public static double canhHuyen(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public static double chuVi(int a, int b) {
        double c = a + b + canhHuyen(a, b);
        return c;
    }
    public static double dienTich(int a, int b) {
        return a*b/2;
    }
    public static void sumOfDigits(){
        int sum,sumSum = 0 ;
        Random rand = new Random();
        int ranNum = rand.nextInt(1000)+1;
        System.out.println("ex4: Số ngẫu nhiên tạo ra là: "+ranNum);
        while (ranNum > 0)
        {
            sum = ranNum % 10;
            ranNum = ranNum /10;
            sumSum = sumSum + sum;
        }
        System.out.println("ex4: Tổng các chữ số ngẫu nhiên là: "+sumSum);
    }
    public static void convertFahrenheit2Celsius(){
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex2:Nhập vào độ F cần đổi: ");
        double  f = scanner.nextDouble();
        c = ((double)5/9)*(f-32);
        System.out.println("ex2:Với nhiệt độ: "+f+"độ F, nhiệt độ c tương úng là: "+ c);
    }
    public static void random_ex10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex10:Nhập vào giới hạn dưới bạn muốn: ");
        int Num1 = scanner.nextInt();
        System.out.println("ex10:Nhập vào giới hạn trên bạn muốn: ");
        int Num2 = scanner.nextInt();
        if(Num2 - Num1 > 0) {
            Random rd = new Random();   // khai báo 1 đối tượng Random
            int ranNum = rd.nextInt((Num2 - Num1))+Num1;
            System.out.println("ex10:Số ngẫu nhiên sinh ra trong khoảng từ " + Num1 + " tới " + Num2 + " là :" + ranNum);
        }
        else {
            System.out.println("ex10:Bạn đã nhập sai");
        }
    }
    public static void time_ex11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex11:Nhập vào số giờ bạn muốn(hour):");
        int hour = scanner.nextInt();
        System.out.println("ex11:Số ngày là "+(hour/24)+" -- Số năm là: "+(hour/8760));
        System.out.println("ex11:Nhập vào số phút bạn muốn(minute):");
        long minute = scanner.nextLong();
        System.out.println("ex11:Số ngày là "+(minute/1440)+" -- Số năm là: "+(minute/527040));
        System.out.println("ex11:Nhập vào số giây bạn muốn(seconds):");
        long seconds = scanner.nextLong();
        System.out.println("ex11:Số ngày là "+(seconds/3600)+" -- Số năm là: "+(seconds/ 31622400));

    }
    public static int bai4(){
        int m= 12345;
        int sum = 0;
        while(m>0){
            sum+=m%10;
            m = m/10;
        }
        return sum;
    }
    public static void bai8(int w){
        System.out.println(w%10);
        System.out.println(w/10%10);
        System.out.println(w/100%10);
        System.out.println(w/1000%10);

    }
    public static void Bai8_splitNumberInteger(int a){
        System.out.print(a/100000 + " ");
        System.out.print(a/10000%10+ " ");
        System.out.print(a/1000%100%10+ " ");
        System.out.print(a/100%1000%100%10+ " ");
        System.out.print(a/10%10000%1000%100%10+ " ");
        System.out.print(a%10);
    }*/
}
