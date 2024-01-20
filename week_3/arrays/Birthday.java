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
            // Simulate one trial with n people
            boolean sameBirthday = false;
            int person = 0;
            int[] room = new int[n];

            while (!sameBirthday) {
                // Assign a random birthday to a person
                int birthday = (int) (Math.random() * n - 1);
                room[person] = birthday;

                // Check for a match with previous birthdays
                for (int p = 0; p < person; p++) {
                    if (room[p] == birthday) {
                        sameBirthday = true;
                        birthdayMatches[person]++; // Increment match count for this group size
                        break;
                    }
                }
                person++;
            }
        }

        // Print results
        double cumulativeSum = 0.0;
        double experiments = trials;
        for (int b = 0; b < birthdayMatches.length; b++) {
            // Calculate and print the fraction of trials with a match for this group size
            double fraction = cumulativeSum / experiments;
            System.out.println((b + 1) + "\t" + birthdayMatches[b] + "\t" + fraction);

            cumulativeSum += birthdayMatches[b];

            if (fraction > 0.5) {
                // Stop printing once probability exceeds 0.5
                break;
            }
        }
    }
}
