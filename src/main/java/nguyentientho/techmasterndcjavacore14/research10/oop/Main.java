package nguyentientho.techmasterndcjavacore14.research10.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main0(String[] args) {
        Son son;
//        Dad dad = new Son();
        Dad dad = new Daughter();
//        Dad dad = (Dad) new GrandFather();
        Daughter daughter = (Daughter) new Dad();

        daughter.eat();
    }

//    static void something() {}

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("hung");
        strings.add("tien");
        strings.add("nam");
        strings.forEach(e -> {
            System.out.println(e);
            int a = 5;
            double b = a * 2;
        });

        Stream<String> stringStream = strings.stream();
    }

}
