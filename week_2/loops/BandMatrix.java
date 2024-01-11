public class BandMatrix {
    public static void main(String[] args) {
        // Read parameter of matrix from the command line
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int distance;

        // Init loop for printint matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distance = Math.abs(i - j);
                if (distance > width) System.out.print("0  ");
                else System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
