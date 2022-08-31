package nguyentientho.techmasterndcjavacore14.buoi5.mana;

import java.util.Arrays;

public class QuanLyCanBo {
    private CanBo[] officersArr;

    public QuanLyCanBo() {
        this.officersArr = new CanBo[100];
    }

    public void themCanBo(CanBo canBo) {
        for (int i = 0; i < officersArr.length; i++) {
            if (officersArr[i] == null) {
                officersArr[i] = canBo;
            }
        }
    }

    public String timKiemCanBoTheoTen(String ten) {
        for (CanBo canBo : officersArr) {
            if (ten.contains(canBo.getTen())) return canBo.toString();
        }
        return "Khong tim thay";
    }

    public void hienThiDanhSachCanBo() {
        System.out.println(Arrays.toString(officersArr));
    }
}
