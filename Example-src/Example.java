import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        final double KGS_CONVERT = 2.2046;
        final int TEAM_SIZE = 3;
        final int TEAM_COUNT = 2;

        for (int tnum = 1; tnum <= TEAM_COUNT; tnum++) {
            // Input for each team
            System.out.print("The name of the team is: ");
            String team = kb.nextLine();

            String[] members = new String[TEAM_SIZE];
            double[] weights = new double[TEAM_SIZE];
            double totalWeight = 0;

            for (int m = 0; m < TEAM_SIZE; m++) {
                System.out.print("Enter the name of member " + (m + 1) + ": ");
                members[m] = kb.nextLine();

                System.out.print("Enter the weight of member " + (m + 1) + " in lbs (must be decimal value): ");
                weights[m] = kb.nextDouble();
                totalWeight += weights[m];

                kb.nextLine(); // Consume newline
            }

            // Display team members
            System.out.println("Team " + team + " members are: " +
                members[0] + ", " + members[1] + ", and " + members[2]);

            // Display total weight in lbs and kg
            System.out.printf("The total weight of team %s is %.2f lbs\n", team, totalWeight);
            double totalKGS = totalWeight / KGS_CONVERT;
            System.out.printf("The total weight of team %s is %.2f kg\n", team, totalKGS);

            // Example: Check if team is under or over a maximum (e.g., 600 lbs)
            double maxWeight = 600.0;
            if (totalWeight > maxWeight) {
                System.out.println("Status: OVER the maximum allowed weight!");
            } else {
                System.out.println("Status: UNDER the maximum allowed weight.");
            }

            System.out.println(); // Blank line between teams
        }

        kb.close();
    }
}
