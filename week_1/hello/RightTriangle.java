/* *****************************************************************************
 *  Name: Maksim Gorev
 *  Specification: Write a program RightTriangle that takes three int command-line 
 *                 arguments and determines whether they constitute the side 
 *                 lengths of some right triangle.
 *  The following two conditions are necessary and sufficient:
 *      Each integer must be positive.
 *      The sum of the squares of two of the integers must equal the square of 
 *      the third integer.
 *  
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        // Parse numbers from args
        int sideA = Integer.parseInt(args[0]);
        int sideB = Integer.parseInt(args[1]);
        int sideC = Integer.parseInt(args[2]);

        // Sort variables
        int minSide = Math.min(sideA, Math.min(sideB, sideC));
        int maxSide = Math.max(sideA, Math.max(sideB, sideC));
        int middleSide = (sideA + sideB + sideC) - minSide - maxSide;

        // Find sum of squares
        int sumOfSquares = (minSide * minSide) + (middleSide * middleSide);

        // Check if it is a right triangle
        System.out.println(sumOfSquares == (maxSide * maxSide));
    }
}