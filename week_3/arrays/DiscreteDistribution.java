public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] subdivides = new int[args.length - 1];
        int[] subintervals = new int[subdivides.length + 1];
        int cumulativeSum = 0;

        for (int i = 0; i < subdivides.length; i++) {
            subdivides[i] = Integer.parseInt(args[i + 1]);
        }

        for (int i = 0; i < subintervals.length - 1; i++) {
            cumulativeSum += subdivides[i];
            subintervals[i + 1] = cumulativeSum;
        }

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * subintervals[subintervals.length - 1] - 1);

            for (int j = 1; j < subintervals.length; j++) {
                if ((subintervals[j - 1] <= r) && (r < subintervals[j])) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
