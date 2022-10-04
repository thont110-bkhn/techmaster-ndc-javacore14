package nguyentientho.techmasterndcjavacore14.research10;

import lombok.Getter;

/**
 * Mã soạn sẵn
 * Trong thế giới thực luật sư có thể đưa cho bạn một bản hợp đồng dài năm trang để bạn ký, nhưng hầu hết hợp đồng là
 * boilerplate - có nghĩa là tất cả những người nhận được hợp đồng đó đều giống nhau, chỉ có một vài dòng được thay đổi
 * ở đây và ở đó.
 * Trong lập trình máy tính, boilerplate code (mã soạn sẵn) đề cập đến các phần mã phải được lặp lại nhiều chỗ mà ít
 * hoặc không có sự thay đổi. Nó thường được sử dụng khi đề cập đến các ngôn ngữ được coi là dài dòng (verbose), tức là
 * lập trình viên phải viết rất nhiều mã để thực hiện các công việc tối thiểu.
 * Ví dụ trong phát triển web (web development) boilerplate code (mã soạn sẵn) đơn giản cho HTML sẽ giống như sau:
 */

@Getter
public class BoilerplateCode {
    private String name;
    private String owner;

    public BoilerplateCode(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    // Phần code bên dưới bị boilerplate
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
