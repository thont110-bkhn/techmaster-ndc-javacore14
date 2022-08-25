package nguyentientho.techmasterndcjavacore14;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Javacore14App {

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

    public static void main(String[] args) {
        int count =0;
        for(int i = 1; i<=5;i++){
             count+=i;
            for(int j=count -i+1; j<=count;j++) {
                System.out.printf("%2d",j);
                System.out.print(" ");

            }
            System.out.println();
        }
    }

}