package interview_coding_solution;

public class Factorial {


        public static void main(String[] args) {

            int num = 10;
            long factorial = 1;
            for(int i = 1; i <= num; ++i)
            {
                // factorial = factorial * i;
                factorial *= i;
            }
            System.out.printf("main.Factorial of %d = %d", num, factorial);
        }
    }
