package nguyentientho.techmasterndcjavacore14.buoi5.vie;

public class KySu extends CanBo {
    private String chuyenNganh;
    public KySu(String ten, int tuoi, String gioiTinh, String diaChi, String chuyenNganh) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "Ky su {" +
                "chuyen nganh ='" + chuyenNganh + '\'' +
                ", ten ='" + ten + '\'' +
                ", tuoi =" + tuoi +
                ", gioi tinh ='" + gioiTinh + '\'' +
                ", dia chi ='" + diaChi + '\'' +
                '}';
    }
}
