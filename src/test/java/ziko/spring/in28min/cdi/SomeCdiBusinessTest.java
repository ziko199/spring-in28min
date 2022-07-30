package ziko.spring.in28min.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {


    @Mock
    private SomeCdiDAO daoMock;
    @InjectMocks
    private SomeCdiBusiness cdiBusiness;


    @Test
    public void testBasicScenario() {

        int expectedResult = 245;
        int[] data = {34,23, 245, 100};
        when(daoMock.getData()).thenReturn(data);

        int actualResult = cdiBusiness.findGreatest();

        assertEquals(expectedResult, actualResult);
    }
}