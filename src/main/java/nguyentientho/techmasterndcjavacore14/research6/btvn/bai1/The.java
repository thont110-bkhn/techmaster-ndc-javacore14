package nguyentientho.techmasterndcjavacore14.research6.btvn.bai1;

public class The {
    private SinhVien sinhVien;
    private String maThe;
    private int ngayMuon;
    private int ngayTra;
    private int soHieuSach;

    public The(SinhVien sinhVien, String maThe, int ngayMuon, int ngayTra, int soHieuSach) {
        this.sinhVien = sinhVien;
        this.maThe = maThe;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public String getMaThe() {
        return maThe;
    }
    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }
    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }
    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return "The{" +
                "sinhVien=" + sinhVien +
                ", maThe='" + maThe + '\'' +
                ", ngayMuon=" + ngayMuon +
                ", ngayTra=" + ngayTra +
                ", soHieuSach=" + soHieuSach +
                '}';
    }
}
