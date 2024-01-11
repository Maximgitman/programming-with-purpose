public class RandomWalker {
    public static void main(String[] args) {
        // Read command line argument r to which calculate Manhattan distance
        int r = Integer.parseInt(args[0]);
        int steps = 0;

        // Init staring coordinate point
        int x = 0;
        int y = 0;
        double probability = 0.0;
        
        // Make random steps and calculate Manhatten distance
        System.out.println("(" + x + ", " + y + ")");
        while (Math.abs(x + y) != r) {
            // Get probability from 0.0 - 1.0
            probability = Math.random();
            
            // Make steps based on probability 
                 if (probability < 0.25) x++; // [0, 0.25)
            else if (probability < 0.50) x--; // [0.25, 0.50)
            else if (probability < 0.75) y++; // [0.50, 0.75)
            else y--;                         // [0.75, 1.0)
            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
