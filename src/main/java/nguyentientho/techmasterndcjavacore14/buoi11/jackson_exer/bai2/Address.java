package nguyentientho.techmasterndcjavacore14.buoi11.jackson_exer.bai2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Address extends Employee  {
    String street;
    String city;
    int zipcode;
}
