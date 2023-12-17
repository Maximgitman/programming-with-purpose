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
        if (sumOfSquares == (maxSide * maxSide)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
