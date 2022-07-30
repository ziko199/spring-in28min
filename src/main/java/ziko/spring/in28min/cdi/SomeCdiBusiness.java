package ziko.spring.in28min.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDAO someCdiDAO;

    public SomeCdiDAO getSomeCdiDAO() {
        return someCdiDAO;
    }

    public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
        this.someCdiDAO = someCdiDAO;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int [] data = someCdiDAO.getData();

        for (int value: data) {
            if (value > greatest) {
                greatest = value;
            }
        }

        return greatest;
    }
}
