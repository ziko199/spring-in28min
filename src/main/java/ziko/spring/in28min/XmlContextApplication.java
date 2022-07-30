package ziko.spring.in28min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ziko.spring.in28min.xml.XmlPersonDAO;

public class XmlContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(XmlContextApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/xml/applicationContext.xml");

        LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

        XmlPersonDAO xmlPersonDAO = (XmlPersonDAO) applicationContext.getBean("xmlPersonDAO");
        XmlPersonDAO xmlPersonDAO2 = applicationContext.getBean(XmlPersonDAO.class);

        System.out.println(xmlPersonDAO);
        System.out.println(xmlPersonDAO.getXmlJdbcConnection());
        System.out.println("###################################");
        System.out.println(xmlPersonDAO2);
        System.out.println(xmlPersonDAO2.getXmlJdbcConnection());

    }

}
