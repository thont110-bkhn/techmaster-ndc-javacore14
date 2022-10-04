package nguyentientho.techmasterndcjavacore14.research10.oop;

public class Son extends Dad {

    @Override
    public void walk(String x) {
        System.out.println("Con Trai của " + x);
    }

    public void eat() {
        System.out.println("Con trai đang ăn cơm");
    }
}
