import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to the tip calculator!");
                System.out.println("How many people are in your group: ");
                int groupNumber = scan.nextInt();
                System.out.println("What's the tip percentage? (0-100): ");
                double tipPercentage = scan.nextDouble();

    }
}
