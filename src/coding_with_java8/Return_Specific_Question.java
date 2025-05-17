package coding_with_java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Return_Specific_Question {


    /*String Input = "Java Concept of The Day"
    Output should be = {J=1, a=3, v=1,  =4, C=1, o=1, n=1, c=1, e=2, p=1, t=1, f=1, T=1, h=1, D=1, y=1}
    Clarification = input.chars() – gives an IntStream of character codes.
    .mapToObj(c -> (char) c) – converts int to Character.
    groupingBy(Function.identity(), counting()) – counts each character.
    LinkedHashMap::new – maintains order of characters as in the string.  */

        public static void main(String[] args) {
            String input = "Java Concept of The Day";

            Map<Character, Long> frequencyMap = input.chars() // returns IntStream
                    .mapToObj(c -> (char) c) // convert int to Character
                    .collect(Collectors.groupingBy(
                            Function.identity(),
                            LinkedHashMap::new,  // to preserve insertion order
                            Collectors.counting()
                    ));

            System.out.println(frequencyMap);
        }
    }