package nguyentientho.techmasterndcjavacore14.research8.bai6;

import java.util.Scanner;

public class Main {
    /**
     * Khoa CNTT của 1 trường đại học cần quản lý việc thanh toán tiền lương cho các cán bộ giá viên trong khoa.
     * Để quản lý được, khoa cần các thông tin sau:
     * Với mỗi cán bộ giáo viên có các thông tin sau: lương cứng, lương thưởng, tiền phạt, lương thực lĩnh,
     * và các thông tin cá nhân: Họ tên, tuổi, quê quán, mã số giáo viên.
     * Yêu cầu 1: Xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi giáo viên.
     * Yêu cầu 2: Xây dựng lớp CBGV để quản lý các thông tin của các cán bộ giáo viên.
     * Yêu cầu 3: Xây dựng các phương thức thêm, xoá các cán bộ giáo viên theo mã số giáo viên.
     * Yêu cầu 4: Tính lương thực lĩnh cho giáo viên: Lương thực = Lương cứng + lương thưởng – lương phạt.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerTeacher managerTeacher = new ManagerTeacher();
        while (true) {
            // show input for user choise
            // 1 to insert
            // 2 to remove => input id. output boolean
            // 4 get salary => input id. output double
            // 5 exit => return

        }
    }
}
