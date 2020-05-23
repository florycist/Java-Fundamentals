package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        int[] count = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 integer numbers: ");
        count[0] = in.nextInt();
        count[1] = in.nextInt();
        count[2] = in.nextInt();
        count[3] = in.nextInt();
        count[4] = in.nextInt();
        count[5] = in.nextInt();
        count[6] = in.nextInt();
        count[7] = in.nextInt();
        count[8] = in.nextInt();
        count[9] = in.nextInt();
        double sum = 0;
        for (int i = 0; i < count.length; i++){
             sum = sum + count[i];
        }
        double average = sum / count.length;

        System.out.println("The sum of the integers is : " + sum);
        System.out.println("The average of the intergers is : " + average);



    }

}