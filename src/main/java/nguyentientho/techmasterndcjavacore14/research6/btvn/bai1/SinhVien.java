package nguyentientho.techmasterndcjavacore14.research6.btvn.bai1;

public class SinhVien {
    private String ten;
    private int tuoi;
    private String lopHoc;

    public SinhVien(String ten, int tuoi, String lopHoc) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lopHoc = lopHoc;
    }

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", lopHoc='" + lopHoc + '\'' +
                '}';
    }
}
