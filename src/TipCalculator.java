import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class TipCalculator {
    public static final DecimalFormat df2 = new DecimalFormat("#.00");

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

        System.out.print("Amount of that food: "); // freestyle, which is collecting the amount
        int amount = scan.nextInt();

        double totalBill = 0;
        int totalAmount = 0;
        ArrayList<String> items = new ArrayList<String>();
        items.add(foodName);
        totalBill += (input * amount);
        totalAmount += amount;

        // loop to get totalBill, food name, and amount until user enters -1
        while (input != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 3.65 (-1 to end): ");
            input = scan.nextDouble();
            scan.nextLine();

            if (input != -1) {
                totalBill += (input * amount);
                totalAmount += amount;
                System.out.print("Enter the food: ");
                foodName = scan.nextLine();

                items.add(foodName);
                System.out.print("Amount of that food: ");
                amount = scan.nextInt();
            }
        }

        // calculations for total bill, total tip, etc
        totalBill = (double) Math.round(totalBill * 100) / 100;
        double totalTip = totalBill * (tipPercentage / 100);
        totalTip = (double) Math.round(totalTip * 100) / 100;
        double billTip = totalTip + totalBill;
        billTip = (double) Math.round(billTip * 100) / 100;
        double perPerson = totalBill / groupNumber;
        perPerson = (double) Math.round(perPerson * 100) / 100;
        double tipPerson = totalTip / groupNumber;
        tipPerson = (double) Math.round(tipPerson * 100) / 100;
        double totalCost = billTip / groupNumber;
        totalCost = (double) Math.round(totalCost * 100) / 100;
        // https://intellipaat.com/community/35143/how-to-round-up-to-2-decimal-places-in-java
        // https://stackoverflow.com/questions/16583604/formatting-numbers-using-decimalformat

        // print the results
        System.out.println("-------------------------------------------");
        System.out.println("Total bill before tip: $" + df2.format(totalBill));
        System.out.println("Total percentage: " + (int) tipPercentage + "%");
        System.out.println("Total Tip: $" + df2.format(totalTip));
        System.out.println("Total bill with tip: $" + df2.format(billTip));
        System.out.println("Per person cost before tip: $" + df2.format(perPerson));
        System.out.println("Tip per person: $" + df2.format(tipPerson));
        System.out.println("Total cost per person: $" + df2.format(totalCost));
        System.out.println("-------------------------------------------");
        System.out.println("Items ordered:");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("Total items ordered: " + totalAmount); // prints total food amount
    }
}