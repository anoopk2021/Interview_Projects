package interview_coding_solution;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Counting_Repeated_Numbers_Java8 {
    public static void main(String[] args) {


        ///11,12,32,43,11,23,12,32,43,43,
        //Requirement - Counting Repeated Numbers


        List<Integer> numberas = Arrays.asList(11, 122, 11, 23, 12, 11, 34, 23);

        Map<Integer, Long> collect = numberas.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));


        System.out.println(collect);


    }
}