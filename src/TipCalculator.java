import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to the tip calculator!");
                System.out.print("How many people are in your group: ");
                int groupNumber = scan.nextInt();
                System.out.print("What's the tip percentage? (0-100): ");
                double tipPercentage = scan.nextDouble();
                System.out.print("Enter a cost in dollars and cents, e.g. 3.65 (-1 to end): ");
                double input = scan.nextDouble();

                double totalBill = 0;
                totalBill += input;

                while (input != -1) {
                    System.out.print("Enter a cost in dollars and cents, e.g. 3.65 (-1 to end): ");
                    input = scan.nextDouble();
                    if (input !=-1){
                        totalBill += input;
                    }
                }

                // calculations
                double totalTip = totalBill * (tipPercentage / 100);
                double billTip = totalTip + totalBill;
                double perPerson = totalBill / groupNumber;
                double tipPerson = totalTip / groupNumber;
                double totalCost = billTip / groupNumber;

                System.out.println();
                System.out.println("Total bill before tip: $" + String.format("%.4g", totalBill));
                System.out.println("Total percentage: " + (int)tipPercentage + "%");
                System.out.println("Total Tip: $" + String.format("%.4g", totalTip));
                System.out.println("Total bill with tip: $" + String.format("%.4g",billTip));
                System.out.println("Per person cost before tip: $" + String.format("%.4g",perPerson));
                System.out.println("Tip per person: $" + String.format("%.4g",tipPerson));
                System.out.println("Total cost per person: $" + String.format("%.4g",totalCost));
    }
}
