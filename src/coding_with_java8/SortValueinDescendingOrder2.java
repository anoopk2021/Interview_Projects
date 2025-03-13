package coding_with_java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class SortValueinDescendingOrder2 {
        public static void main(String[] args) {
            // Sort in descending order by value = { Orange =100, Apple =220, Banana = 70, Grape +300, Papaya +120} Given map with values
            Map<String, Integer> fruitMap = new HashMap<>();
            fruitMap.put("Orange", 100);
            fruitMap.put("Apple", 220);
            fruitMap.put("Banana", 70);
            fruitMap.put("Grape", 300);
            fruitMap.put("Papaya", 120);

            // Sorting the map by values in descending order
            LinkedHashMap<String, Integer> sortedMap = fruitMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue,  // Merge function (not needed here)
                            LinkedHashMap::new // Preserve order
                    ));

            // Print sorted map
            sortedMap.forEach((key, value) -> System.out.println(key + " = " + value));
        }

    }
