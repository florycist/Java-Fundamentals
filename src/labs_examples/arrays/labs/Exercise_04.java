package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] irregularArray = new int[][]{
                {2, 4},
                {6, 8, 10},
                {12, 14, 16, 18}
        };

        for (int[] a : irregularArray) {
            for (int e : a) {
                System.out.print(e + " ");
            }
        }

        System.out.print('\n');

    }

}
