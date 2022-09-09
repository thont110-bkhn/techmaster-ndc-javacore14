package nguyentientho.techmasterndcjavacore14.buoi6.thuchanh;

public class SinhVien {
    private String hoVaTen;
    private int age;
    private String lopHoc;

    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getLopHoc() {
        return lopHoc;
    }
    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", age=" + age +
                ", lopHoc='" + lopHoc + '\'' +
                '}';
    }
}
