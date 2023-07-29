package interview_coding_solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindingLowestValueUsingMinBy {
    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(77000, 60000, 95000, 99999, 94999, 125000);
        Integer lowestValue = items.stream().collect(Collectors.minBy((x, y) -> x - y)).get();
        System.out.println(lowestValue);


    }
}