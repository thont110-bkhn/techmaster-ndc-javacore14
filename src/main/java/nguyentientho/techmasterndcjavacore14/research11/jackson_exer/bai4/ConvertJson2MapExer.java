package nguyentientho.techmasterndcjavacore14.research11.jackson_exer.bai4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Đọc file Json từ file java và convert nó thành Map bằng thư viện
 */
public class ConvertJson2MapExer {
    public static void main(String[] args) throws IOException {
        //Convert Json to map
        byte[] mapData = Files.readAllBytes(Paths.get("data.txt"));
        Map<String,String> myMap = new HashMap<String, String>();

        ObjectMapper objectMapper = new ObjectMapper();
        myMap = objectMapper.readValue(mapData, HashMap.class);
        System.out.println("Map is: "+myMap);

        //Cách khác
        myMap = objectMapper.readValue(mapData, new TypeReference<HashMap<String,String>>() {});
        System.out.println("Map using TypeReference: "+myMap);
    }
}
