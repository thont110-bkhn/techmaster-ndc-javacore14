package nguyentientho.techmasterndcjavacore14.buoi6.btvn.bai1;

import java.util.ArrayList;
import java.util.List;

public class TheMuon {

    private List<The> theList;

    public TheMuon() {
        this.theList = new ArrayList<>();
    }

    public void themThe(The the) {
        this.theList.add(the);
    }

    public boolean xoaThe(String maThe) {
//        The the = this.theL.stream().filter(t -> t.getMaThe().equals(id)).findFirst().orElse(null);

//        theList.forEach(t -> {
//            t.getMaThe().equals(maThe);
//            theList.remove(t);
//            System.out.println("delete done the = " + t);
//
//        });
//        return true;

        for (int i = 0; i < theList.size(); i++) {
            The the = theList.get(i);
            if (the.getMaThe().equals(maThe)) {
                theList.remove(the);
                return true;
            }
        }
        return false;
    }

    public void hienThi() {
//        for (The the : theL) {
//            System.out.println(the);
//        }
        System.out.println(theList);
    }
}
