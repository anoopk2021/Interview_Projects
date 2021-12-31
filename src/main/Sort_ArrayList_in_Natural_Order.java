package main;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort_ArrayList_in_Natural_Order {

        public static void main(String[] args) {

            // create an ArrayList
            ArrayList<String> languages = new ArrayList<>();

            // add elements to ArrayList
            languages.add("Python");
            languages.add("Swift");
            languages.add("C");
            languages.add("JavaScript");
            System.out.println("Unsorted ArrayList: " + languages);

            // sort the ArrayList in ascending order
            languages.sort(Comparator.naturalOrder());

            System.out.println("Sorted ArrayList: " + languages);
        }
    }
