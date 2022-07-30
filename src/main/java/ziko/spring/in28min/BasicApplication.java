package ziko.spring.in28min;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ziko.spring.in28min.basic.BinarySearchImpl;

@Configuration
@ComponentScan("ziko.spring.in28min.basic")
public class BasicApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicApplication.class);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        System.out.println(result);

    }

}
