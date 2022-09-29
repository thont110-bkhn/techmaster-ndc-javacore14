package nguyentientho.techmasterndcjavacore14.research9;

import java.util.Comparator;

/**
 * <h1> Đây là 1 lớp có phần javadoc để show <h1/>
 */
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
