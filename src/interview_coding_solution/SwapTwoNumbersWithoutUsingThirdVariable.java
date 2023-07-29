package interview_coding_solution;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {

    public static void main(String[] args) {

        System.out.println("Enter the Value of X and Y ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before swapping Numbers: " + x + " " + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swapping: " + x + " " + y);

    }
}
