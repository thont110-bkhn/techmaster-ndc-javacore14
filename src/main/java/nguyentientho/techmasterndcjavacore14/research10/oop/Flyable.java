package nguyentientho.techmasterndcjavacore14.research10.oop;

public interface Flyable {
    void run();

    default void name() {
        System.out.println("viết phương thức trong interface");
    }

    void thatTinh();
}
