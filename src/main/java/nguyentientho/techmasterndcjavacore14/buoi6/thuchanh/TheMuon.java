package nguyentientho.techmasterndcjavacore14.buoi6.thuchanh;

import java.util.ArrayList;
import java.util.List;

public class TheMuon {
    private List<The> theList = new ArrayList<The>(10);

    public void themThe(The the) {
        theList.add(the);
        System.out.println(the.toString());
    }

    public boolean xoaThe(The the) {
        return theList.remove(the);
    }

    public boolean xoaThe(String maThe) {
        for (The the : theList) {
            if (the.getMaThe().equalsIgnoreCase(maThe)) theList.remove(the);
        }
        return false;
    }

    public void hienThi() {
        System.out.println(theList);
    }
}
