package coding_with_java8;
import java.util.*;
import java.util.stream.*;
public class Finding_EvenNumber_UsingStream {
    public static void main(String[] args) {

                List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
                list.stream()
                        .filter(n -> n%2 == 0)
                        .forEach(System.out::println);
            }
        }



