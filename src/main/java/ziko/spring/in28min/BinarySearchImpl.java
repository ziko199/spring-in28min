package ziko.spring.in28min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
