package nguyentientho.techmasterndcjavacore14.buoi12;

import nguyentientho.techmasterndcjavacore14.buoi11.jackson_exer.bai2.CustomException;

/**
 * Bài 1:
 * Viết chương trình nhập vào 2 số thực. Bắt ngoại lệ để khi nhập vào không phải là số.
 * Cài đặt hàm chia, trong đó bắt ngoại lệ nếu số chia là 0 thì thông báo phép chia không hợp lệ và kết thúc chương trình.
 * <p>
 * Bài 2:
 * Khai báo 1 mảng có n phần tử các số nguyên, viết hàm nhập các phần tử cho mảng. Bắt ngoại lệ nếu nhập phần từ có giá
 * trị là 100 thì in ra các phần tử đã nhập và kết thúc chương trình.
 * <p>
 * Bài 3:
 * Tạo một InvalidTriangleException InvalidTriangleException bằng cách kế thừa lớp Exception Exception.
 * Sử dụng Exception Exception
 * để phục vụ quá trình bắt lỗi trong quá trình khởi tạo đối tượng tam giác (Triangle),
 * nếu người dùng khởi tạo không đúng các cạnh của tam giác sẽ throw ra
 * I lidT i l E ti InvalidTriangleException.
 * <p>
 * Cạnh tam giác không h nh tam giác không hợp lệ khi:
 * • Giá trị cạnh < 0;
 * • Giá trị cạnh là số quá lớn (xét trong giới hạn khoảng số nguyên).
 */
public class ExplaintionB12 {
    public static void main(String[] args) throws Exception {
        handleException(5/0);
    }

    public static void handleException(int i) throws Exception {
        try {
            System.out.println(i *10);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
