import java.util.Scanner;
public class U2L2Runner {
    public static void main(String[] args) {
        // User input
        Scanner s = new Scanner(System.in);
        System.out.println("How many pieces of lumber do you need for the house you are building?");
        int numLumber = s.nextInt();
        System.out.println("How many windows do you need?");
        int numWindows = s.nextInt();
        System.out.println("What is the tax rate for your area (in decimal form)?");
        double taxRate = s.nextDouble();

        // Pricing for materials
        ConstructionPricer currentPrice = new ConstructionPricer(11.50, 25.75, taxRate);
        // Calculating
        double priceNoTax = currentPrice.materialsCost(numLumber,numWindows);
        double priceWithTax = currentPrice.totalWithTax(priceNoTax);
        // output
        System.out.println("Total Materials Cost: $" + round(priceNoTax));
        System.out.println("Grand Total after Tax: $" + round(priceWithTax));

    }
    public static String round(double num) {
        return String.format("%.2f", num);

    }
}
