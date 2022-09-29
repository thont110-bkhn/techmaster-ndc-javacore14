package nguyentientho.techmasterndcjavacore14.research9;

public class Day {
    private int date;

    public Day(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Day{" +
                "date=" + date +
                '}';
    }
}
