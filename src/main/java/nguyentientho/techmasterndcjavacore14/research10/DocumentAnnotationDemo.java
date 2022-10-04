package nguyentientho.techmasterndcjavacore14.research10;

import java.lang.annotation.Documented;

/**
 * Quoting from Oracle’s official site, “It [annotation-based development] lets us avoid writing boilerplate code under
 * many circumstances by enabling tools to generate it from annotations in the source code. This leads to a declarative
 * programming style where the programmer says what should be done and tools emit the code to do it.”
 */
@Documented
@interface CustomAnnotation {
    String value();
}

@CustomAnnotation("Tientho")
public class DocumentAnnotationDemo {
    public static void main(String[] args) {
        System.out.println("this is techmaster");
    }
}
