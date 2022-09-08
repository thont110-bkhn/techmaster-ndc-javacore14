package nguyentientho.techmasterndcjavacore14.buoi6.btvn.bai1;

import java.util.ArrayList;
import java.util.List;

public class TheMuon {

    private List<The> theL;

    public TheMuon() {
        this.theL = new ArrayList<>();
    }

    public void themThe(The the) {
        this.theL.add(the);
    }

    public boolean xoaThe(String maThe) {
//        The the = this.theL.stream().filter(t -> t.getMaThe().equals(id)).findFirst().orElse(null);

//        theL.forEach(t -> {
//            t.getMaThe().equals(maThe);
//            theL.remove(t);
//            System.out.println("delete done the = " + t);
//
//        });
//        return true;
        for (int i = 0; i < theL.size(); i++) {
            The the = theL.get(i);
            if (the.getMaThe().equals(maThe)) {
                theL.remove(the);
                return true;
            }
        }
        return false;
    }

    public void hienThi() {
        for (The the : theL) {
            System.out.println(the);
        }
    }
}
