package nguyentientho.techmasterndcjavacore14.research14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice {
    // ví dụ 1:
    public static void main0(String[] args) {
        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        Collections.sort(languages, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });
        for (String language : languages) {
            System.out.println(language);
        }
    }

    // ví dụ 11
    public static void main11(String[] args) {

        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

        Collections.sort(languages, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });

        for (String language : languages) {
            System.out.println(language);
        }
    }

    // ví dụ 12
    public static void main12(String[] args) {
        @FunctionalInterface
        interface Addable {
            int add(int a, int b);
        }

        // Multiple parameters with data type in lambda expression
        Addable ad1 = (int a, int b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters in lambda expression
        Addable ad2 = (a, b) -> (a + b);
        System.out.println(ad2.add(10, 20));

        // Lambda expression without return keyword.
        Addable ad3 = (a, b) -> (a + b);
        System.out.println(ad3.add(10, 20));

        // Lambda expression with return keyword.
        Addable ad4 = (a, b) -> {
            return (a + b);
        };
        System.out.println(ad4.add(10, 20));

        // Lambda expression without return keyword.
        Addable ad5 = (a, b) -> (a + b);
        System.out.println(ad5.add(10, 20));

        // Lambda expression with multi-statement
        Addable ad6 = (a, b) -> {
            int sum = (a + b);
            return sum;
        };
        System.out.println(ad6.add(10, 20));
    }

    // ví dụ 2:
    public interface Shape {
        void formulaArea();
        void formulaRerimeter();
    }
    public static void printFormula() {
        // Local class
        class Rectangle implements Shape {
            @Override
            public void formulaArea() {
                System.out.println("A * B");
            }

            @Override
            public void formulaRerimeter() {
                System.out.println("A + B");
            }
        }

        Rectangle rectangle = new Rectangle();
        rectangle.formulaArea();
        // Anonymous class
        Shape cricle = new Shape() {
            @Override
            public void formulaArea() {
                System.out.println("R * R * 3.14");
            }

            @Override
            public void formulaRerimeter() {
                System.out.println("2 * PI * R");
            }
        };

        cricle.formulaArea();
    }
    public static void main1(String[] args) {
        printFormula();
    }

    // ví dụ 3:
    static class Machine {
        public void start() {
            System.out.println("Machine Starting...");
        }
    }

    public static void printMachine() {
        Machine machine = new Machine() {
            @Override
            public void start() {
                System.out.println("yahooooooo!!...");
            }
        };
        machine.start();
        System.out.println("machine 1");
        System.out.println(machine.getClass().getName());
        Machine machine2 = new Machine();
        machine2.start();
        System.out.println("machine 2");
        System.out.println(machine2.getClass().getName());
    }

    public static void mainz(String[] args) {
        printMachine();
    }

    //ví dụ 3A
    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }
    public class Java3A {
        public static void doSomething1() {
            final int num = 1;
            Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

            stringConverter.convert(2); // 3
        }

        public static void doSomething2() {
            int num = 1;
            Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

            stringConverter.convert(2); // 3
        }

        public static void doSomething3() {
            int num = 1;
            Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

            stringConverter.convert(2); // 3

            // Lambda expression will throw error at num varialbe.
            // Local variable num defined in an enclosing scope must be final or effectively
            // num = 3;
        }

    }

    //ví dụ 5
    public class Java5 {

        static int outerStaticNum;
        int outerNum;

        void testScopes() {
            Converter<Integer, String> stringConverter1 = (from) -> {
                outerNum = 1;
                return String.valueOf(from);
            };

            Converter<Integer, String> stringConverter2 = (from) -> {
                outerStaticNum = 1;
                return String.valueOf(from);
            };
        }

    }

}
