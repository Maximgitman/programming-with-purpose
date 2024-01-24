public class Minesweeper {
    public static void main(String[] args) {
        // Read parameters of mines field
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // Random mines positions and init empty mines field
        boolean[][] minesLocation = new boolean[m][n];
        int[][] minesField = new int[m + 2][n + 2];

        // Assign random coordinates for mines
        while (k > 0) {
            int x = (int) (Math.random() * m);
            int y = (int) (Math.random() * n);

            if (!minesLocation[x][y]) {
                minesLocation[x][y] = true;
                k--;
            }
        }

        // Calculate For each cell not containing a mine, count the number of neighboring mines
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minesLocation[i][j]) {
                    for (int a = -1; a <= 1; a++) {
                        for (int b = -1; b <= 1; b++) {
                            if (i + a >= 0 && i + a < m && j + b >= 0 && j + b < n) {
                                minesField[i + a + 1][j + b + 1]++;
                            }
                        }
                    }
                }
            }
        }

        // Print results
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (minesLocation[i - 1][j - 1]) {
                    System.out.print("*  ");
                } else {
                    System.out.print(minesField[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
