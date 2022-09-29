package nguyentientho.techmasterndcjavacore14.research14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/** Note1: Các đặc điểm của Java Stream
 * Stream không lưu trữ các phần tử của collection hay array. Nó chỉ thực hiện các phép toán tổng hợp (chẳng hạn như filter() và count() mà chúng ta đã thấy trong ví dụ trên để có được stream dữ liệu mong muốn.
 * Stream không phải là một cấu trúc dữ liệu (data structure).
 * Stream là immutable object. Các hoạt động tổng hợp mà chúng ta thực hiện trên Collection, Array hoặc bất kỳ nguồn dữ liệu nào khác không làm thay đổi dữ liệu của nguồn, chúng chỉ trả lại stream mới. Chúng ta đã thấy ở ví dụ trên là thực hiện filter() các các số chẵn bằng cách sử dụng các hoạt động của stream nhưng nó không thay đổi các phần tử của List numbers.
 * Tất cả các hoạt động stream là lazy (lười biếng), có nghĩa là chúng không được thực hiện cho đến khi cần thiết. Để làm được điều này, hầu hết các thao tác với Stream đều return lại một Stream mới, giúp tạo một mắc xích bao gồm một loạt các thao tác nhằm thực thi các thao tác đó một cách tối ưu nhất. Mắc xích này còn được gọi là pipeline.
 * Các phần tử của luồng chỉ được truy cập một lần trong suốt vòng đời của Stream. Giống như một Iterator, một Stream mới phải được tạo ra để duyệt lại các phần tử của dữ liệu nguồn.
 * Stream không dùng lại được, nghĩa là một khi đã sử dụng nó xong, chúng ta không thể gọi nó lại để sử dụng lần nữa.
 * Chúng ta không thể dùng index để truy xuất các phần tử trong Stream.
 * Stream hỗ trợ thao tác song song các phần tử trong Collection hay Array.
 */

/** Note2: So sánh Streams với Collections
 * Chúng ta sử dụng Stream hoặc Collection khi chúng ta phải làm việc theo danh sách các phần tử.
 * Collection là cấu trúc dữ liệu chứa các phần tử trong bộ nhớ. Những phần tử này sẽ được tính toán trước khi chúng thực sự được thêm vào Collection.
 * Ngược lại, Stream không phải là một cấu trúc dữ liệu. Stream là một luồng thực hiện tính toán các phần tử theo yêu cầu. Vì vậy, nó có thể được xem rằng các Collection có các yếu tố tính tức thời (eager), trong khi các Stream có yếu tố tính lười biếng (lazy).
 * Mặc dù chúng ta có thể tạo Stream từ Collection và sử dụng một số phương thức trên Collection. Tuy nhiên, Collection gốc vẫn không thay đổi. Do đó, Stream không thể thay đổi dữ liệu.
 * Và một đặc điểm quan trọng của Stream là chúng có thể chuyển đổi dữ liệu, vì các hoạt động trên Stream có thể tạo ra một cấu trúc dữ liệu khác, như map() và collect() như trong các ví dụ trên.
 */

/** Note3: Cách làm việc của stream
 * Tạo Stream (stream source).
 * Thực hiện các thao tác trung gian (intermediate operations) trên stream ban đầu để chuyển đổi nó thành một stream khác và tiếp tục thực hiện các hoạt động trung gian khác. Trong ví dụ trên, hoạt động filter() là hoạt động trung gian. Có thể có nhiều hoạt động trung gian.
 * Thực hiện thao tác đầu cuối (terminal operation) trên stream cuối cùng để nhận kết quả và sau đó bạn không thể sử dụng lại chúng. Trong ví dụ trên, phép tính count() là hoạt động đầu cuối.
 */

public class StreamExplain {
    List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);

    public void withStream() {
        // return stream
        long count = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.printf("There are %d elements that are even", count);

        // return stream parallel
        long count2 = numbers.parallelStream().filter(num -> num % 2 == 0).count();

        // b3: Tạo Stream cho những kiểu primitive
        IntStream.range(1, 4).forEach(System.out::println); // 1 2 3
        IntStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3
        DoubleStream.of(1, 2, 3).forEach(System.out::println); // 1.0 2.0 3.0
        LongStream.range(1, 4).forEach(System.out::println); // 1 2 3
        LongStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3

        // b4: Tạo Stream từ các cấu trúc dữ liệu khác như mảng, List
        String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };
        // Get Stream using the Arrays.stream
        Stream<String> testStream1 = Arrays.stream(languages);
        testStream1.forEach(x -> System.out.println(x));
        // Get Stream using the Stream.of
        Stream<String> testStream2 = Stream.of(languages);
        testStream2.forEach(x -> System.out.println(x));
        // Generate Streams from Collections
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
        items.stream().forEach(item -> System.out.println(item));
        // Generate Streams using Stream.generate()
        Stream<String> stream = Stream.generate(() -> "gpcoder").limit(3);
        String[] testStrArr = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(testStrArr)); // [gpcoder, gpcoder, gpcoder]
        // Generate Streams using Stream.iterate()
        Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
        iterateNumbers.forEach(System.out::print); // 12345
        // Generate Streams from APIs like Regex
        String str = "Welcome,to,gpcoder";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::print);// Welcometogpcoder

        //b5: tạo stream sang cấu trúc dữ liệu khác:
        // Get Collections using stream.collect(Collectors.toList())
        Stream<String> stream51 = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        List<String> languages5 = stream51.collect(Collectors.toList());
        System.out.println(languages);
        // Get arrays using stream.toArray(EntryType[]::new)
        Stream<String> stream52 = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        String[] languages52 = stream52.toArray(String[]::new);
        System.out.println(Arrays.toString(languages));

        // Sử dụng toán tử trung gian
        // b6: Sử dụng filter() - filter() operation helps eliminate elements based on certain criteria
        Stream.iterate(1, count123 -> count123 + 1) //
                .filter(number -> number % 3 == 0) //
                .limit(6) //
                .forEach(System.out::println);

        // b7: Sử dụng skip(), limit()
        // limit() Returns a stream consisting of the elements of this stream, truncated
        // to be no longer than maxSize in length.
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data.stream() //
                .skip(1) //
                .limit(3) //
                .forEach(System.out::print); // C#C++PHP

        // b8: Sử dụng map()
        // map() operation helps map elements to the corresponding results
        List<String> data8 = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data8.stream() //
                .map(String::toUpperCase) // convert each element to upper case
                .forEach(System.out::println);

        // bai9: Sử dụng sorted()
        // sorted() operation helps sort elements based on certain criteria
        List<String> data9 = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        // sorted according to natural order
        data9.stream() //
                .sorted() //
                .forEach(System.out::println);
        // sorted according to the provided Comparator
        data9.stream() //
                .sorted((s1, s2) -> s1.length() - s2.length()) //
                .forEach(System.out::println);

        // Sử dụng Terminal Operations
        // bai10: Sử dụng forEach() -> foreach operations helps iterate the elements of the Stream
        Stream.iterate(1, count10 -> count10 + 1) //
                .filter(number -> number % 3 == 0) //
                .limit(6) //
                .forEach(System.out::println);

        // bai11: Sử dụng collect() -> collect() giúp thu thập kết quả Stream sang một Collection.
        Stream<String> stream11 = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        List<String> languages11 = stream11.collect(Collectors.toList());
        System.out.println(languages11);

        // bai12:

    }
}
