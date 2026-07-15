public class WelcomeCard {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 24;
        String rank = "Rookie";
        double salary = 45000.75;
        float membershipFee = 299.99f;

        int annualBonus = (int) (salary * 0.12);

        System.out.println("+-------------------------------+");
        System.out.println("|       Coding Guild Welcome    |");
        System.out.println("+-------------------------------+");
        System.out.printf("| Name           : %-12s |%n", name);
        System.out.printf("| Age            : %-12d |%n", age);
        System.out.printf("| Rank           : %-12s |%n", rank);
        System.out.printf("| Salary         : $%-10.2f |%n", salary);
        System.out.printf("| Membership fee : $%-10.2f |%n", membershipFee);
        System.out.printf("| Annual bonus   : $%-10d |%n", annualBonus);
        System.out.println("+-------------------------------+");
        System.out.println("|  Welcome to the guild, Ravi!  |");
        System.out.println("+-------------------------------+");
    }
}
