package nguyentientho.techmasterndcjavacore14.buoi5.canbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class QuanLyCanBo {
    Logger logger = LoggerFactory.getLogger(QuanLyCanBo.class);
    private CanBo[] officersArr;
    private int coutCanBo = 0;

    public QuanLyCanBo() {
        this.officersArr = new CanBo[10];
    }

    public void themCanBo(CanBo canBo) {
        for (int i = 0; i <= coutCanBo; i++) {
            if (officersArr[i] == null) {
                officersArr[i] = canBo;
                coutCanBo++;
                break;
            }
        }
    }

/*
    public String timKiemCanBoTheoTen(String ten) {
        for (CanBo canBo : officersArr) {
            if (ten.contains(canBo.getTen())) return canBo.toString();
        }
        return "Khong tim thay";
    }
*/

    public String timKiemCanBoTheoTen(String ten) {
        String result = "";
        for (CanBo canBo : officersArr) {
            if (canBo != null && canBo.getTen().contains(ten)) {
                result += canBo.toString() + "\n";
            }
        }
        return result.length() > 0 ? result.toString() : "Khong tim thay";
    }

/*    public String timKiemCanBoTheoTen(String ten) {
        StringBuilder result = new StringBuilder();
        for (CanBo canBo : officersArr) {
            if (canBo != null && canBo.getTen().contains(ten)) {
                result.append(canBo);
                result.append("\n");
            }
        }
        return result.length() > 0 ? result.toString() : "Khong tim thay";
    }*/


    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : officersArr) {
            if (canBo != null) {
                System.out.println(canBo.toString());
            }
        }
        //        System.out.println(Arrays.toString(officersArr));
    }
}
