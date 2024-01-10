public class GeneralizedHarmonic {
    public static void main(String[] args) {
        // Read varable from command line
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        // Init variable for answer
        double harmonicNumber = 0;

        // Calcualte harmonic number in a loop
        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1 / Math.pow(i, r);
        }

        // Print results
        System.out.println(harmonicNumber);
    }
}
