package nguyentientho.techmasterndcjavacore14.research11.annotation_exer;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Viết 1 chương trình sử dụng annotation tuỳ chỉnh để đánh dấu các trường
 */
public class AnnotationExer {

    public static void main(String[] args) throws Exception {
        System.out.println("Java Custom Annotation Example");
        System.out.println();

        User usr = new User();
        usr.setEmail("john.doe@example.com");
        usr.setName("John Doe");
        usr.setId(112);
        usr.setCreated(new Date());

        for (Field field : usr.getClass().getDeclaredFields()) {
            MetaDataField metaDataField = field.getAnnotation(MetaDataField.class);
            System.out.println("field name: " + metaDataField.name());

            // changed the access to public
            field.setAccessible(true);
            Object value = field.get(usr);
            System.out.println("field value: " + value);

            System.out.println("field type: " + metaDataField.type());
            System.out.println("is primary: " + metaDataField.isPrimaryKey());
            System.out.println();
        }
    }
}
