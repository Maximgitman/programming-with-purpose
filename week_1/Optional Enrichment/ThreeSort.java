/* ****************************************************************************
*
*  Exercise: 1.2.30 Uniform random numbers. Write a program that prints five
*  uniform random numbers between 0 and 1, their average value, and their
*  minimum and maximum values. Use Math.random(), Math.min(), and Math.max().
*
* ****************************************************************************/


public class ThreeSort {
    public static void main(String[] args) {
        // Define 5 random variable
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Sort varaibles
        int min_number = Math.min(a, Math.min(b, c));
        int max_number = Math.max(a, Math.max(b, c));
        int middle_number = (a + b +  c) - min_number - max_number;

        // Print input variables
        System.out.println(min_number);
        System.out.println(middle_number);
        System.out.println(max_number);
    }
}
