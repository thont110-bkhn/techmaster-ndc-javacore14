package nguyentientho.techmasterndcjavacore14.buoi10.oop;

public class Son extends Dad implements Runable {

    @Override
    public void walk(String x) {
        System.out.println("Con Trai của " + x);
    }

    public void eat() {
        System.out.println("Con trai đang ăn cơm");
    }
}