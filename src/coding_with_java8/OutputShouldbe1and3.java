package coding_with_java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OutputShouldbe1and3 {


        public static void main(String[] args) {
            String input = "I am Anoop, I am from Pune, I am a developer";

            // Convert to stream, clean punctuation, and count occurrences
            Map<String, Long> wordCount = Arrays.stream(input.replaceAll("[^a-zA-Z ]", "").split("\\s+"))
                    .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

            // Get the counts of "am" and "Anoop"
            long amCount = wordCount.getOrDefault("am", 0L);
            long anoopCount = wordCount.getOrDefault("anoop", 0L);

            // Print the required output
            System.out.println(anoopCount + " and " + amCount);
        }
    }

