package nguyentientho.techmasterndcjavacore14.buoi11.jackson_exer.bai2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@Inherited
public @interface CustomData {
}
