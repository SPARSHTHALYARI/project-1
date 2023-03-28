import java.util.Scanner;

public class BankAcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our bank!");

        while (true) {
            System.out.println("\nWhat type of account do you want to open?\n");
            System.out.println("1. Savings Account");
            System.out.println("2. Fixed Deposit Account");
            System.out.println("3. Recurring Deposit Account");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Sb sb = new Sb();
                    sb.calculator();
                    break;

                case 2:
                    FD fd = new FD();
                    fd.interestCalculator();
                    break;

                case 3:
                    RD rd = new RD();
                    rd.interestCalculator();
                    break;

                case 4:
                    System.out.println("\nThank you for banking with us!");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice, please try again.");
                    break;
            }
        }
    }

    static class Account {
        Scanner sc = new Scanner(System.in);

        private String name;
        private String pan;
        private int age;

        public void setDetails() {
            System.out.println("\nEnter your details below:\n");

            System.out.println("Enter your name: ");
            this.name = sc.nextLine();

            System.out.println("Enter your age: ");
            this.age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter your PAN number: ");
            this.pan = sc.nextLine();

            System.out.println("\nThank you for entering your details. Your account has been created.");
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String getPan() {
            return this.pan;
        }
    }

    static class Sb {
        Scanner sc = new Scanner(System.in);

        private float amount;
        private int days;

        public void calculator() {
            System.out.println("\nEnter the amount you want to deposit:");
            this.amount = sc.nextFloat();

            System.out.println("Enter the number of days you want to invest for (minimum 14 days, maximum 30 days):");
            this.days = sc.nextInt();

            if (this.days >= 14 && this.days <= 30) {
                double interest = this.amount * 0.065;
                double total = this.amount + interest;

                System.out.println("\nYour total amount after " + this.days + " days is: " + total);
            } else {
                System.out.println("\nSorry, you can only invest for a minimum of 14 days and a maximum of 30 days.");
            }
        }
    }

    static class FD {
        Scanner sc = new Scanner(System.in);

        private float amount;
        private int days;
        private int age;

        public void interestCalculator() {
            Account account = new Account();
            account.setDetails();

            System.out.println("\nEnter the amount you want to deposit:");
            this.amount = sc.nextFloat();

            System.out.println("Enter the number of days you want to invest for:");
            this.days = sc.nextInt();

            System.out.println("\nAre you a senior citizen? (y/n)");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("y")) {
                this.age = account.getAge();
            }

            if (this.age >= 60) {
                if (this.days < 14) {
                    double interest = this.amount * 0.08;
                    double total = this.amount + interest
