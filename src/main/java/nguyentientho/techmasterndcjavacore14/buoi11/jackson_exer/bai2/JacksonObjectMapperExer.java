package nguyentientho.techmasterndcjavacore14.buoi11.jackson_exer.bai2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Convert Json to Object POJO Java
 * {
 *   "id": 123,
 *   "name": "Pankaj",
 *   "permanent": true,
 *   "address": {
 *     "street": "Albany Dr",
 *     "city": "San Jose",
 *     "zipcode": 95129
 *   },
 *   "phoneNumbers": [
 *     123456,
 *     987654
 *   ],
 *   "role": "Manager",
 *   "cities": [
 *     "Los Angeles",
 *     "New York"
 *   ],
 *   "properties": {
 *     "age": "29 years",
 *     "salary": "1000 USD"
 *   }
 * }
 */
public class JacksonObjectMapperExer {

    public static void main(String[] args) throws IOException {

        // Đọc dữ liệu từ file employee thành chuỗi (mảng byte)
        byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));

        // Tạo 1 đối tượng ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string thành Employee Object
        Employee emp = objectMapper.readValue(jsonData, Employee.class);

        System.out.println("Employee Object\n"+emp);

/*        // Convert employee Object thành String Json
        Employee emp1 = createEmployee();
        //cấu hình objectMapper để in ra format đẹp
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        //ghi vào màn hình console, ngoài console có thể ghi vào file or vv...
        StringWriter stringEmp = new StringWriter();
        objectMapper.writeValue(stringEmp, emp1);
        System.out.println("Employee JSON is\n"+stringEmp);*/
    }

    public static Employee createEmployee() {

        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("David");
        emp.setPermanent(false);
        emp.setPhoneNumbers(new long[] { 123456, 987654 });
        emp.setRole("Manager");

        Address add = new Address();
        add.setCity("Bangalore");
        add.setStreet("BTM 1st Stage");
        add.setZipcode(560100);
        emp.setAddress(add);

        List<String> cities = new ArrayList<String>();
        cities.add("Los Angeles");
        cities.add("New York");
        emp.setCities(cities);

        Map<String, String> props = new HashMap<String, String>();
        props.put("salary", "1000 Rs");
        props.put("age", "28 years");
        emp.setProperties(props);

        return emp;
    }

}
