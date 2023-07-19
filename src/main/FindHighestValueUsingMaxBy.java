package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindHighestValueUsingMaxBy {
    public static void main(String[] args) {
      List<Integer> items = Arrays.asList(25000, 45000, 70000, 90000, 35000);
        Integer highestValue = items.stream()
                .collect(Collectors.maxBy((x, y) -> x - y)).get();
        System.out.println(highestValue);
    }
}
