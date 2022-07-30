package ziko.spring.in28min.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDAO {

    public  int[] getData() {
        return new int[] {6, 87, 45, 100};
    }
}
