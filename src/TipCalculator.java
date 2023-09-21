import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to the tip calculator!");
                System.out.print("How many people are in your group: ");
                int groupNumber = scan.nextInt();
                System.out.println("What's the tip percentage? (0-100): ");
                double tipPercentage = scan.nextDouble();
                System.out.println("Enter a cost in dollars and cents, e.g. 3.65 (-1 to end): ");
                double input = scan.nextDouble();

                double totalBill = 0;
                while (input != -1) {
                    System.out.println("Enter a cost in dollars and cents, e.g. 3.65 (-1 to end): ");
                    input = scan.nextDouble();
                    totalBill += input;

                }

                // calculations
                double totalTip = totalBill * tipPercentage;
                double billTip = totalTip + totalBill;
                double perPerson = totalBill / groupNumber;
                double tipPerson = totalTip / groupNumber;
                double totalCost = totalTip / groupNumber;

                System.out.println();
                System.out.println("Total bill before tip: $" + totalBill);
                System.out.println("Total percentage: " + tipPercentage + "%");
                System.out.println("Total Tip: $" + totalTip);
                System.out.println("Total bill with tip: $" + billTip);
                System.out.println("Per person cost before tip: $" + perPerson);
                System.out.println("Tip per person: $" + tipPerson);
                System.out.println("Total cost per person: $" + totalCost);
    }
}
