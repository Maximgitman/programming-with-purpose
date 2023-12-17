/* ****************************************************************************
*
*  Exercise: 1.2.30 Uniform random numbers. Write a program that prints five
*  uniform random numbers between 0 and 1, their average value, and their
*  minimum and maximum values. Use Math.random(), Math.min(), and Math.max().
*
* ****************************************************************************/


public class UniformRandomNumbers {
    public static void main(String[] args) {
        // Define 5 random variable
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        // Print 5 uniform random numbers
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println();

        // Print average number
        System.out.println("Average number: " + (a + b + c + d + e) / 5);
        
        // Print min number
        System.out.println("Min number: " + Math.min(a, Math.min(Math.min(b, c), Math.min(d, e))));
        
        // Print max number
        System.out.println("Max number: " + Math.max(a, Math.max(Math.max(b, c), Math.max(d, e))));
    }
}
