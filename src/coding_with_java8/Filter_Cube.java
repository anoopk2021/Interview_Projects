package coding_with_java8;

import java.util.Arrays;
import java.util.List;
public class Filter_Cube {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
        integerList.stream()
                .map(i -> i * i * i)
                .filter(i -> i > 50)
                .forEach(System.out::println);
        /* 1. Creates a List of Integers:
           2. Streams the list:
           3. Maps each number to its cube:
           4. Filters out values ≤ 50:
        */
    }
}