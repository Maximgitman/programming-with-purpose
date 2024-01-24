/**
 * Simulates the birthday paradox to estimate the probability of shared birthdays in a group.
 * 
 * @author Maksim Gorev
 */
public class Birthday {

    /**
     * Runs multiple trials of the birthday simulation for a given group size.
     * 
     * @param args Command-line arguments:
     *            - args[0]: The number of people in the group (n).
     *            - args[1]: The number of trials to run.
     */
    public static void main(String[] args) {
        // Read n and trials from the command line
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // Array to track how many trials resulted in a match for each number of people
        int[] birthdayMatches = new int[n];

        // Conduct trials
        for (int i = 0; i < trials; i++) {
            boolean sameBirthday = false;
            int person = 0;
            int[] room = new int[n];
        
            while (!sameBirthday && person < n) {
                // Assign a random birthday to a person
                int birthday = (int) (Math.random() * n);
                room[person] = birthday;
        
                // Check for a match with previous birthdays
                for (int p = 0; p < person; p++) {
                    if (room[p] == birthday) {
                        sameBirthday = true;
                        birthdayMatches[person]++;
                        break;
                    }
                }
                person++;
            }
        }

        // Print results
        double cumulativeSum = 0.0;
        for (int b = 0; b < birthdayMatches.length; b++) {
            cumulativeSum += birthdayMatches[b];
            double fraction = cumulativeSum / trials;
            System.out.println((b + 1) + "\t" + birthdayMatches[b] + "\t" + fraction);

            if (fraction > 0.5) {
                break;
            }
        }
    }
}
