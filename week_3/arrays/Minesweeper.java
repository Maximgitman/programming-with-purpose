public class Minesweeper {
    public static void main(String[] args) {
        // Read parameters if mines field
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // Random mines positions and init empty mines field
        int[][] minesLocation = new int[k][2];
        int[][] minesField = new int[m][n];

        // Assign random coordinates
        for (int i = 0; i < minesLocation.length; i++) {
            // Get random coordinates for mines
            int x = (int) (Math.random() * m);
            int y = (int) (Math.random() * n);

            // Assign coordinates for the mine
            // TODO: Check if location is busy
            minesLocation[i][0] = x;
            minesLocation[i][1] = y;
        }

        // Print mines coordinates
        for (int i = 0; i < minesLocation.length; i++) {
            for (int j = 0; j < minesLocation[i].length; j++) {
                System.out.print(minesLocation[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate For each cell not containing a mine, count the number of
        // neighboring mines
        for (int l = 0; l < minesField.length; l++) {
            for (int h = 0; h < minesField.length; h++) {
                for (int xAxis = 0; xAxis < minesLocation.length; xAxis++) {
                    for (int yAxis = 0; yAxis < minesLocation.length; yAxis++) {
                        if ((minesField[xAxis][0] == l) && (minesField[yAxis][1] == h)) {
                            System.out.println("Culculate distance for neighboring mines");
                        }
                    }
                }
            }
        }
    }
}