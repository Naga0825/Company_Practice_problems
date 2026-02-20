import java.util.Scanner;

public class SwiggyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        double total = 0;

        do {
            System.out.println("\n===== Welcome to Swiggy =====");
            System.out.println("1. Pizza - ₹200");
            System.out.println("2. Burger - ₹120");
            System.out.println("3. Biryani - ₹250");
            System.out.println("4. Sandwich - ₹100");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter quantity: ");
                    int pizzaQty = sc.nextInt();
                    total = total + (pizzaQty * 200);
                    System.out.println("Added to cart ✅");
                    break;

                case 2:
                    System.out.print("Enter quantity: ");
                    int burgerQty = sc.nextInt();
                    total = total + (burgerQty * 120);
                    System.out.println("Added to cart ✅");
                    break;

                case 3:
                    System.out.print("Enter quantity: ");
                    int biryaniQty = sc.nextInt();
                    total = total + (biryaniQty * 250);
                    System.out.println("Added to cart ✅");
                    break;

                case 4:
                    System.out.print("Enter quantity: ");
                    int sandwichQty = sc.nextInt();
                    total = total + (sandwichQty * 100);
                    System.out.println("Added to cart ✅");
                    break;

                case 5:
                    System.out.println("\n===== Final Bill =====");
                    System.out.println("Total Amount: ₹" + total);
                    System.out.println("Thank you for ordering 😊");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}