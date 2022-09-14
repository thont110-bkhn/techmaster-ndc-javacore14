package nguyentientho.techmasterndcjavacore14.buoi7;

import java.util.Comparator;

public class DayCompare implements Comparator<Day> {
    @Override
    public int compare(Day o1, Day o2) {
        return Integer.valueOf(o1.getDate()).compareTo(o2.getDate());
    }

//    @Override
//    public int compare(Day o1, Day o2) {
//        if (o1.getDate() > o1.getDate()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }

}
