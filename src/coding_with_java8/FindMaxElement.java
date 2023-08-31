package coding_with_java8;

import java.util.*;
import java.util.stream.*;

public class FindMaxElement{
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}
