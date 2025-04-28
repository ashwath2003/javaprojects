package myJavaProjects;

import java.util.Scanner;

public class currencyConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double usdToInr = 83.20;
        double usdToEur = 0.94;
        double usdToGbp = 0.80;
        double usdToJpy = 155.38;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println();

        System.out.print("Enter amount in USD: ");
        double usdAmount = scan.nextDouble();

        System.out.println("\nChoose the currency to convert to:");
        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. JPY (Japanese Yen)");

        System.out.print("Enter option : ");
        int option = scan.nextInt();

        double convertedAmount = 0;
        String currency = "";

        switch (option) {
            case 1:
                convertedAmount = usdAmount * usdToInr;
                currency = "INR";
                break;
            case 2:
                convertedAmount = usdAmount * usdToEur;
                currency = "EUR";
                break;
            case 3:
                convertedAmount = usdAmount * usdToGbp;
                currency = "GBP";
                break;
            case 4:
                convertedAmount = usdAmount * usdToJpy;
                currency = "JPY";
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                scan.close();
                return; 
        }

        System.out.printf("\n%.2f USD = %.2f %s\n", usdAmount, convertedAmount, currency);

        System.out.println("\nThank you for using the converter!");
        scan.close();
    }
}

