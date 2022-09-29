package nguyentientho.techmasterndcjavacore14.research11.jackson_exer.bai2;

import lombok.Data;

@Data
public class Address extends Employee  {
    String street;
    String city;
    int zipcode;
}
