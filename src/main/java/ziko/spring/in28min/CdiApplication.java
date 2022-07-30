package ziko.spring.in28min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ziko.spring.in28min.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan("ziko.spring.in28min.cdi")
public class CdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CdiApplication.class);

        SomeCdiBusiness someCdiBusiness  = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("{}", someCdiBusiness);
    }

}
