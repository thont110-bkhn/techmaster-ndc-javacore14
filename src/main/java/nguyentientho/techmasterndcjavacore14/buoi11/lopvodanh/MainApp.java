package nguyentientho.techmasterndcjavacore14.buoi11.lopvodanh;

/**
 * Tạo 1 lớp hinhGiDo có kiểu trả về là HinhHoc nhưng và triển khai các phương thức trong interface HinhHoc
 */
public class MainApp {
    public static void main(String[] args) {
        HinhHoc hinhGiDo = new HinhHoc() {
            protected float banKinh;

            @Override
            public void nhapBanKinh(float banKinh) {
                this.banKinh = banKinh;
            }

            @Override
            public float tinhChuVi() {
                return 2 * PI * banKinh;
            }

            @Override
            public float tinhDienTich() {
                return PI * banKinh * banKinh;
            }

            @Override
            public void xuatThongTin() {
                System.out.println("Hình Vô Danh");
                System.out.println("Chu vi: " + tinhChuVi());
                System.out.println("Diện tích: " + tinhDienTich());
            }
        };
        hinhGiDo.nhapBanKinh(10);
        hinhGiDo.xuatThongTin();
    }
}
