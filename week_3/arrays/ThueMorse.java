public class ThueMorse {
    public static void main(String[] args) {
        // Read matrix size from command line
        int n = Integer.parseInt(args[0]);

        // Init sequence with Zeros
        int[] sequence = new int[n];

        // Create Thue-Morse sequence, start from 1th idx because 0th is 0
        for (int i = 1; i < n; i++) {
            if ((i % 2) != 0) {
                sequence[i] = 1 - sequence[i - 1];
            } else {
                sequence[i] = sequence[i / 2];
            }
        }
        
        // Print pattern where ith == jth '+' and ith != jth '-'
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence.length; j++) {
                if (sequence[i] == sequence[j]) System.out.print("+  "); // Two spaces after +
                else System.out.print("-  "); // Two spaces after -
            }
            System.out.println();
        }
    }
}