package ziko.spring.in28min.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier(value = "quick")
    private SortAlgorithm sortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.quickSortAlgorithm = sortAlgorithm;
//    }

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

//    @PostConstruct
    public void postConstruct() {
        LOGGER.info("postConstruct");
    }

//    @PreDestroy
    public void preDestroy() {
        LOGGER.info("preDestroy");
    }
}
