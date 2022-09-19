package nguyentientho.techmasterndcjavacore14.buoi10.oop;

public class Daughter extends Dad{

    @Override
    public void walk(String x) {
//        super.walk("");
        System.out.println("Lơp Con gái của "  + x + "Đang đi bộ");
    }

    public void eat() {
        System.out.println("Con gái đang ăn");
    }
}
