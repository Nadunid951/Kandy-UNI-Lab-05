import java.util.Scanner;

public class IT26102627Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        int startDate, endDate, days;
        double totalAmount, discountRate = 0.0;
        double discountAmount, finalAmount;

        System.out.print("Enter start date: ");
        startDate = input.nextInt();

        System.out.print("Enter end date: ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");

        } else if (startDate >= endDate) {

            System.out.println("Error: Start date must be less than end date.");

        } else {

            days = endDate - startDate;

            totalAmount = days * ROOM_CHARGE;

            if (days < 3) {
                discountRate = 0.0;
            } else if (days <= 4) {
                discountRate = DISCOUNT_10;
            } else {
                discountRate = DISCOUNT_20;
            }

            discountAmount = totalAmount * discountRate;
            finalAmount = totalAmount - discountAmount;

            System.out.println("Number of days reserved: " + days);
            System.out.printf("Total room charges: Rs. %.2f%n",
                    totalAmount);
            System.out.printf("Discount: %.0f%%%n",
                    discountRate * 100);
            System.out.printf("Discount amount: Rs. %.2f%n",
                    discountAmount);
            System.out.printf("Final amount to be paid: Rs. %.2f%n",
                    finalAmount);
        }

        input.close();
    }
}