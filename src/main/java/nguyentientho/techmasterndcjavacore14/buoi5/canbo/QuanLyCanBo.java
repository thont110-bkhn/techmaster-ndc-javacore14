package nguyentientho.techmasterndcjavacore14.buoi5.canbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLyCanBo {
    Logger logger = LoggerFactory.getLogger(QuanLyCanBo.class);
    private static CanBo[] officersArr;
    private int coutCanBo = 0;

    public QuanLyCanBo() {
        this.officersArr = new CanBo[10];
    }

    public void themCanBo(/*CanBo canBo*/) {
//        for (int i = 0; i <= coutCanBo; i++) {
//            if (officersArr[i] == null) {
//                officersArr[i] = canBo;
//                coutCanBo++;
//                break;
//            }
//        }
    }


    public void timKiemCanBoTheoTen(String ten) {
        List<CanBo> canBoNew = new ArrayList<>();
        for (CanBo canBo : officersArr) {
            if (canBo != null && canBo.getTen().contains(ten)) {
                canBoNew.add(canBo);
            }
        }
        if (canBoNew.size() == 0) {
            System.out.println("Khong tim thay");
        } else System.out.println(canBoNew.toString());
    }


    public String timKiemCanBoTheoTen(String ten, int age) {
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
