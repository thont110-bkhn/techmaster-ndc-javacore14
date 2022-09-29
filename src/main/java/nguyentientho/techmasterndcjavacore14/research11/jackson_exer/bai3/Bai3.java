package nguyentientho.techmasterndcjavacore14.research11.jackson_exer.bai3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonCarStr =
                "[{ \"color\" : \"White\", \"type\" : \"Vinfast\" }, { \"color\" : \"Blue\", \"type\" : \"Toyota\" }]";
        List<Car> listCar = objectMapper.readValue(jsonCarStr, new TypeReference<List<Car>>(){});
        listCar.forEach(p -> System.out.println(p.toString()));
    }
}
