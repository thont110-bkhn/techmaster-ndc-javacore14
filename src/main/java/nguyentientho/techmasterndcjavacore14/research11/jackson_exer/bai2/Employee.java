package nguyentientho.techmasterndcjavacore14.research11.jackson_exer.bai2;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
    int id;
    static final String name = "";
    boolean permanent;

    Address address;

    int[] phoneNumbers;
    String role;
    String[] cities;

    Properties properties;


}