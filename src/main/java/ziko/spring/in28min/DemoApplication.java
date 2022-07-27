package ziko.spring.in28min;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
        System.out.println(result);
    }

}
