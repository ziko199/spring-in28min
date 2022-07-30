package ziko.spring.in28min;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ziko.spring.in28min.properties.SomeExternalService;

@Configuration
@ComponentScan("ziko.spring.in28min.properties")
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApplication.class);

        SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

        System.out.println(service.returnServiceURL());

    }

}
