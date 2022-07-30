package ziko.spring.in28min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ziko.spring.in28min.scope.PersonDAO;

@Configuration
@ComponentScan("ziko.spring.in28min.scope")
public class ScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeApplication.class);

        PersonDAO personDAO_1 = applicationContext.getBean(PersonDAO.class);

        PersonDAO personDAO_2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO_1);
        LOGGER.info("{}", personDAO_1.getJdbcConnection());
        LOGGER.info("{}", personDAO_1.getJdbcConnection());
        LOGGER.info("{}", personDAO_2);
        LOGGER.info("{}", personDAO_2.getJdbcConnection());
    }

}
