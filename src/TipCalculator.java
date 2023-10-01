import java.util.Scanner;
import java.util.ArrayList;

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
        scan.nextLine();

        System.out.print("Enter the food: ");
        String foodName = scan.nextLine();

        System.out.print("Amount of that food: ");
        int amount = scan.nextInt();

        double totalBill = 0;
        int totalAmount = 0;
        ArrayList<String> items = new ArrayList<String>();
        items.add(foodName);
        totalBill += (double)(input * amount);
        totalAmount += amount;

        // loop
        while (input != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 3.65 (-1 to end): ");
            input = scan.nextDouble();
            scan.nextLine();
            System.out.print("Enter the food: ");
            foodName = scan.nextLine();

            items.add(foodName);
            System.out.print("Amount of that food: ");
            amount = scan.nextInt();

                if (input !=-1){
                    totalBill += (double)(input * amount);
                    totalAmount += amount;
            }
        }

        // calculations
        totalBill = (double) Math.round(totalBill * 100) / 100;
        double totalTip = totalBill * (tipPercentage / 100);
        totalTip = (double) Math.round(totalTip * 100) / 100;
        double billTip = totalTip + totalBill;
        billTip = (double) Math.round(billTip * 100) / 100;
        double perPerson = totalBill / groupNumber;
        perPerson = (double) Math.round(perPerson * 100) / 100;
        double tipPerson = totalTip / groupNumber;
        tipPerson= (double) Math.round(tipPerson * 100) / 100;
        double totalCost = billTip / groupNumber;
        totalCost = (double) Math.round(totalCost * 100) / 100;
        // https://intellipaat.com/community/35143/how-to-round-up-to-2-decimal-places-in-java

        // prints the result
        System.out.println("-------------------------------------------");
        System.out.println("Total bill before tip: $" + totalBill);
        System.out.println("Total percentage: " + (int)tipPercentage + "%");
        System.out.println("Total Tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + billTip);
        System.out.println("Per person cost before tip: $" + perPerson);
        System.out.println("Tip per person: $" + tipPerson);
        System.out.println("Total cost per person: $" + totalCost);
        System.out.println("-------------------------------------------");
        System.out.println("Items ordered:");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Total items ordered: " + totalAmount);
    }
}