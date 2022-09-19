package nguyentientho.techmasterndcjavacore14.buoi10.oop;

public class Main {
    public static void main0(String[] args) {
//        Dad dad = new Son();
        Dad dad = new Daughter();
//        Dad dad = (Dad) new GrandFather();
        Daughter daughter = (Daughter) new Dad();

        daughter.eat();
    }

    public static void main(String[] args) {
        Dad dad = new Daughter(); // Upcasting
        Daughter daughter = (Daughter) dad; // Downcasting

//        daughter.walk("Bố");
        daughter.walk("");
    }
}
