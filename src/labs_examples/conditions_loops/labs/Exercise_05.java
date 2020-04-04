package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter upper bound number: ");
        int num1 = in.nextInt();
        System.out.println("Enter lower bound number: ");
        int num2 = in.nextInt();
        int sum = 0;
        float count = (num1 - num2) + 1;
        for ( int i = num2; i <= num1; i++ ){

            sum += i;

        }
        System.out.println("The sum is: " + sum);
        float average = sum/count;
        System.out.println("The average is: " + average);




    }

}
