package nguyentientho.techmasterndcjavacore14.buoi11.annotation_exer;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MetaDataField {
    String name();

    Class<?> type();

    boolean isPrimaryKey() default false;
}
