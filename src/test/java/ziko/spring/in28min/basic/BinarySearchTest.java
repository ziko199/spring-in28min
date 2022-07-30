package ziko.spring.in28min.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import ziko.spring.in28min.BasicApplication;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BasicApplication.class)
public class BinarySearchTest {

    @Autowired
    private BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        // given
        int expectedResult = 3;
        // when
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);
        // then
        assertEquals(expectedResult, actualResult);
    }
}