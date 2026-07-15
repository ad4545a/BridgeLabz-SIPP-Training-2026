import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votesForCandidate1 = 0;
        int votesForCandidate2 = 0;
        int votesForCandidate3 = 0;
        int totalVoters = 0;

        System.out.println("Election Booth Manager");
        System.out.println("Enter 0 as age to exit the polling booth.");

        while (true) {
            System.out.print("Enter voter age: ");
            int age = scanner.nextInt();

            if (age == 0) {
                break;
            }

            if (age < 0) {
                System.out.println("Invalid age. Please enter a positive age or 0 to exit.");
                continue;
            }

            if (age < 18) {
                System.out.println("Not eligible to vote. Next voter please.\n");
                continue;
            }

            System.out.println("Eligible to vote.");
            System.out.println("Choose a candidate: 1, 2, or 3");
            System.out.print("Enter candidate number: ");
            int vote = scanner.nextInt();

            if (vote == 1) {
                votesForCandidate1++;
            } else if (vote == 2) {
                votesForCandidate2++;
            } else if (vote == 3) {
                votesForCandidate3++;
            } else {
                System.out.println("Invalid candidate selection. Vote not recorded.");
                continue;
            }

            totalVoters++;
            System.out.println("Vote recorded. Thank you for voting.\n");
        }

        System.out.println("Polling closed.");
        System.out.println("Total eligible votes recorded: " + totalVoters);
        System.out.println("Candidate 1 votes: " + votesForCandidate1);
        System.out.println("Candidate 2 votes: " + votesForCandidate2);
        System.out.println("Candidate 3 votes: " + votesForCandidate3);
        scanner.close();
    }
}
