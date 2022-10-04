package nguyentientho.techmasterndcjavacore14.research15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExplaintion {
    /** sử dụng stream để:
     * 1) đếm số phần tử trong mảng
     * 2) tính điểm trung bình của tất cả các học sinh
     * 3) tính số lượng học sinh đạt điểm A (điểm lớn hơn hoặc bằng 90)
     * 4) Sử dụng toán tử collect() để tạo 1 List<String> chứa tên những hsinh có điểm dưới 70, in rõ họ tên các hsinh này
     * 5) in tên và điểm của học sinh, sắp xếp theo họ
     * 6) in tên và điểm của học sinh, sắp xếp theo số điểm
     */
    public static void main0(String[] args) {
        record ScoreInfo(String firstName,
                         String lastName,
                         int score) {}
        ScoreInfo[] scoreData = new ScoreInfo[]{
                new ScoreInfo("Nguyen", "Thuan", 70),
                new ScoreInfo("Le", "La", 85),
                new ScoreInfo("Phung", "Do", 82),
                new ScoreInfo("Tran", "Cung", 97),
                new ScoreInfo("Nguyen", "Tien", 66),
                new ScoreInfo("Dinh", "Hung", 80),
                new ScoreInfo("Tran", "Nam", 48),
                new ScoreInfo("Van", "Cao", 90),
                new ScoreInfo("Nhu", "Ca", 55),
                new ScoreInfo("Pham", "Thach", 73),
                new ScoreInfo("Le", "Duan", 54),
                new ScoreInfo("Tran", "Phu", 78),
                new ScoreInfo("Pham", "Dong", 51),
                new ScoreInfo("Ha", "Lan", 93),
                new ScoreInfo("Dang", "Ha", 95)
        };
    }

    public static void main(String[] args) {
        record ScoreInfo(String lastName,
                         String firstName,
                         int score) {}
        ScoreInfo[] scoreData = new ScoreInfo[]{
                new ScoreInfo("Nguyen", "Thuan", 70),
                new ScoreInfo("Le", "La", 85),
                new ScoreInfo("Phung", "Do", 82),
                new ScoreInfo("Tran", "Cung", 97),
                new ScoreInfo("Nguyen", "Tien", 66),
                new ScoreInfo("Dinh", "Hung", 80),
                new ScoreInfo("Tran", "Nam", 48),
                new ScoreInfo("Van", "Cao", 90),
                new ScoreInfo("Nhu", "Ca", 55),
                new ScoreInfo("Pham", "Thach", 73),
                new ScoreInfo("Le", "Duan", 54),
                new ScoreInfo("Tran", "Phu", 78),
                new ScoreInfo("Pham", "Dong", 51),
                new ScoreInfo("Ha", "Lan", 93),
                new ScoreInfo("Dang", "Ha", 95)
        };
        // c1
        long count = Arrays.stream(scoreData).parallel().count();
        System.out.println ("Số lượng sinh viên:" + count);

        /** c2
         *  b1 - chuyển 1 stream đối tượng thành 1 stream chỉ chứa mình điểm của hsinh
         *  b1 - sử dụng toán tử terminal average() để tính trung bình và trả về 1 số double
         */
        double avg = Arrays.stream(scoreData).parallel()
                .mapToInt(s -> s.score)
                .average()
                .getAsDouble();
        System.out.printf("Điểm trung bình:%1.2f %n", avg);

        /// c3
        long countA = Arrays.stream(scoreData).parallel()
                .filter( s -> s.score >= 90 )
                .count();
        System.out.println("Số lượng học sinh đạt điểm A: " + countA);
        System.out.println();

        /** c4
         * Để có tên của các sinh viên, chuyển Stream<ScoreInfo> thành một stream<String> bằng toán tử map
         * Cuối cùng sử dụng toán tử collect để convert stream về 1 List
         */
        List<String> failing = Arrays.stream(scoreData)
                .filter( s -> (s.score < 70) )
                .map( s -> (s.lastName + " " + s.firstName) )
                .collect(Collectors.toList() );
        System.out.println("Học sinh học lực yếu: ");
        failing.stream().forEach( System.out::println );
        System.out.println();

        /** c5
         * Sử dụng toán tử sorted() để sắp xếp các phần tử trước (nhận tham số là so sánh 2 giá trị từ stream)
         * sau đó sử dụng toán tử lặp để in từng phần tử
         */
        System.out.println ("Dữ liệu được sắp xếp theo họ:");
        Arrays.stream (scoreData)
                .sorted ((s1, s2) -> s1.lastName.compareTo(s2.lastName))
                .forEach (s -> System.out.printf("%s %s:%d %n ", s.lastName, s.firstName, s.score));
        System.out.println();

        // c6
        System.out.println ("Dữ liệu được sắp xếp theo điểm:");
        Arrays.stream (scoreData)
                .sorted ((s1, s2) -> s1.score - s2.score)
                .forEach (s -> System.out.printf ("%s %s:%d %n", s .lastName, s.firstName, s.score));
    }
}
