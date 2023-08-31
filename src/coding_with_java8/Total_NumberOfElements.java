package coding_with_java8;

import java.util.*;
import java.util.stream.*;

public class Total_NumberOfElements{
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count =  myList.stream()
                .count();
        System.out.println(count);
    }
}