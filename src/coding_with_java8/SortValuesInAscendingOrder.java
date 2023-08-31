package coding_with_java8;
import java.util.*;

public class SortValuesInAscendingOrder {
        public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

            myList.stream()
                    .sorted()
                    .forEach(System.out::println);
        }
    }
