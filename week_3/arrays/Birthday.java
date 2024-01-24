/**
 * Simulates the birthday paradox to estimate the probability of shared
 * birthdays in a group.
 * 
 * @author Maksim Gorev
 */
public class Birthday {

    /**
     * Runs multiple trials of the birthday simulation for a given group size.
     * 
     * @param args Command-line arguments:
     *             - args[0]: The number of people in the group (n).
     *             - args[1]: The number of trials to run.
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] birthdayMatches = new int[n];

        for (int i = 0; i < trials; i++) {
            boolean sameBirthday = false;
            int person = 0;
            int[] room = new int[365]; // 365 days in a year

            while (!sameBirthday && person < n) {
                int birthday = (int) (Math.random() * 365);
                room[person] = birthday;

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

        double cumulativeSum = 0.0;
        for (int b = 0; b < birthdayMatches.length; b++) {
            cumulativeSum += birthdayMatches[b];
            double fraction = cumulativeSum / trials;
            System.out.println((b + 1) + "\t" + birthdayMatches[b] + "\t" + fraction);

            if (fraction >= 0.5) {
                break;
            }
        }
    }
}
