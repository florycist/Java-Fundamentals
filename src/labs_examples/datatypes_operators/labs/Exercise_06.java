package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double r = 3.14;
        int h = 5;
        double p = 3.14;

        double volume = p * r * r * h; //Volume of cylinder = πr2h
        double surfaceArea =(2 * p * r * h) + (2 * p * r * r); //2πrh+2πr2

        System.out.println("The volume of the cylinder is " + volume);
        System.out.println("The surface area of the cylinder is " + surfaceArea);

    }
}