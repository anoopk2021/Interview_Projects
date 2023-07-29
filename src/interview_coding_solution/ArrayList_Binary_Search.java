package interview_coding_solution;

import java.util.ArrayList;
import java.util.Collections;
//..
public class ArrayList_Binary_Search {


        public static void main(String[] args) {

            ArrayList<Integer> aListNumbers
                    = new ArrayList<Integer>();

            aListNumbers.add(7);
            aListNumbers.add(2);
            aListNumbers.add(9);
            aListNumbers.add(5);
            aListNumbers.add(8);

            System.out.println("Original ArrayList: " + aListNumbers);

            //ArrayList must be sorted before binary search
            Collections.sort(aListNumbers);

            System.out.println("Sorted ArrayList: " + aListNumbers);

            //binary search ArrayList
            int index = Collections.binarySearch(aListNumbers, 8);

            if(index >= 0)
                System.out.println("Element found at index: " + index);
            else
                System.out.println("Insertion point: " + index);

        }

}
