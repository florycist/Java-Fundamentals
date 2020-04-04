package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for month of the year: ");
        int input = in.nextInt();

        switch (input){
            case 1:
                System.out.println("The month entered is January.");
                break;
            case 2:
                System.out.println("The month entered is February.");
                break;
            case 3:
                System.out.println("The month entered is March.");
                break;
            case 4:
                System.out.println("The month entered is April.");
                break;
            case 5:
                System.out.println("The month entered is May.");
                break;
            case 6:
                System.out.println("The month entered is June.");
                break;
            case 7:
                System.out.println("The month entered is July.");
                break;
            case 8:
                System.out.println("The month entered is August.");
                break;
            case 9:
                System.out.println("The month entered is September.");
                break;
            case 10:
                System.out.println("The month entered is October.");
                break;
            case 11:
                System.out.println("The month entered is November.");
                break;
            case 12:
                System.out.println("The month entered is December.");
                break;
            default:
                System.out.println("Other");
                break;
        }

    }

}
