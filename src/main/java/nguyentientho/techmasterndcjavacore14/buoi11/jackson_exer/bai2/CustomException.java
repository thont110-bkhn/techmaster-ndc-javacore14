package nguyentientho.techmasterndcjavacore14.buoi11.jackson_exer.bai2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomException extends Exception {
    String message;
    String cause2;
}
