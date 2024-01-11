public class RandomWalkers {
    public static void main(String[] args) {
        // Read command line argument r to which calculate Manhattan distance
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;
        double n = trials;

        // Begin loop for all trials
        for (int i = 0; i < trials; i++){
            // Init staring coordinate point
            int x = 0;
            int y = 0;
            double probability = 0.0;

            // Make random steps and calculate Manhatten distance
            while (Math.abs(x) + Math.abs(y) != r) {
                // Get probability from 0.0 - 1.0
                probability = Math.random();
                
                // Make steps based on probability 
                     if (probability < 0.25) x++; // [0, 0.25)
                else if (probability < 0.50) x--; // [0.25, 0.50)
                else if (probability < 0.75) y++; // [0.50, 0.75)
                else y--;                         // [0.75, 1.0)
                steps++;
            }
        }

        // Calculate final results and print them out
        double totalSteps = steps;
        double avgSteps = totalSteps / n;

        System.out.println("average number of steps = " + avgSteps);
    }
}
