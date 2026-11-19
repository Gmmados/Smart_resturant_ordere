
import java.util.Scanner;

public class order {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
     

    // Display project information

    System.out.println("Project Prepared By:");
    System.out.println("Name: Mohamed Abdelslam");
    System.out.println("Reg Number: 202510441");

    System.out.println("Course: Introduction to Java Programming");
    

    // Display the topics learned
    System.out.println("\nTopics Learned and Applied:");
    System.out.println("1- Variables and Data Types");
    System.out.println("2- User Input using Scanner");
    System.out.println("3- If and Else Statements");
    System.out.println("4- Logical Operators");
    System.out.println("5- Arithmetic Operations");
    System.out.println("6- Constants");
    System.out.println("7- Conditional Statements");
    System.out.println("8- Output Formatting");

    System.out.println("========================================");
    System.out.println("    WELCOME TO SMART RESTAURANT");
    System.out.println("========================================\n");
    // Display learning resources
    System.out.println("\n===== LEARNING RESOURCES =====");
    System.out.println("1- Telusko - Java Tutorial");
    System.out.println("   YouTube:");
    System.out.println("   https://www.youtube.com/playlist?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5");

    System.out.println("\n2- W3Schools - Java Tutorial");
    System.out.println("   https://www.w3schools.com/java/default.asp");

                System.out.println("========================================");
        // Constants for discount and tip
        final double StudentDiscount = 0.10;
        final double SeniorDiscount = 0.05;
        final double TipRate = 0.10;

        //variables
        String Name;
        int Age;
        double MealPrice;
        int Drinks;
        double DrinkPrice = 0;
        String DrinkName;
        boolean IsStudent;
        int Rating;
        double DrinksCost;
        double Subtotal;
        double DiscountRate = 0;
        double DiscountAmount;
        double TipAmount;
        double FinalBill;
        int WholeAmount;

        // Get customer information
        System.out.print("Enter customer name: ");
        Name = Input.nextLine();

        System.out.print("Enter customer age: ");
        Age = Input.nextInt();

        // Welcome message
        System.out.println("Hello " + Name + "! Welcome to the Smart Restaurant.");
        System.out.println("We have a lot of meals and drinks for you to choose from.");

        // Display food menu
        System.out.println("\n===== SMART RESTAURANT FOOD MENU =====");
        System.out.println("1. Burger       - $8.00");
        System.out.println("2. Pizza        - $12.00");
        System.out.println("3. Chicken      - $15.00");

        System.out.print("Choose your meal (1-3): ");
        int Choice = Input.nextInt();

        // Check the customer's meal choice
        if (Choice == 1) {
            MealPrice = 8.00;
        }
        else if (Choice == 2) {
            MealPrice = 12.00;
        }
        else if (Choice == 3) {
            MealPrice = 15.00;
        }
        else {
            System.out.println("Invalid meal choice!");
            Input.close();
            return;
        }

        // Display drinks menu
        System.out.println("\n===== DRINKS MENU =====");
        System.out.println("1. Water         - $1.00");
        System.out.println("2. Coffee        - $3.00");
        System.out.println("3. Soda          - $2.00");

        System.out.print("Choose your drink (1-3): ");
        int DrinkChoice = Input.nextInt();

        // Check the customer's drink choice
        if (DrinkChoice == 1) {
            DrinkPrice = 1.00;
            DrinkName = "Water";
        }
        else if (DrinkChoice == 2) {
            DrinkPrice = 3.00;
            DrinkName = "Coffee";
        }
        else if (DrinkChoice == 3) {
            DrinkPrice = 2.00;
            DrinkName = "Soda";
        }
        else {
            System.out.println("Invalid drink choice!");
            Input.close();
            return;
        }

        // Ask for the number of drinks
        System.out.print("Enter number of drinks: ");
        Drinks = Input.nextInt();

        // Check if the number of drinks is valid
        if (Drinks <= 0) {
            System.out.println("Invalid number of drinks!");
            Input.close();
            return;
        }

        // Ask if the customer is a student
        System.out.print("Is the customer a student? (true/false): ");
        IsStudent = Input.nextBoolean();

        // Get customer service rating
        System.out.print("Enter service rating (1-5): ");
        Rating = Input.nextInt();

        // Calculate drinks cost and subtotal
        DrinksCost = Drinks * DrinkPrice;
        Subtotal = MealPrice + DrinksCost;

        // Calculate discount on customer information
        if (IsStudent && Age >= 60) {
            DiscountRate = StudentDiscount;
        }
        else if (IsStudent) {
            DiscountRate = StudentDiscount;
        }
        else if (Age >= 60) {
            DiscountRate = SeniorDiscount;
        }
        else {
            DiscountRate = 0;
        }

        // Calculate discount amount
        DiscountAmount = Subtotal * DiscountRate;

        // Calculate tip on service rating
        if (Rating >= 1 && Rating <= 5) {

            if (Rating >= 4) {
                TipAmount = Subtotal * TipRate;
            }
            else {
                TipAmount = 0;
            }

        }
        else {
            System.out.println("Error: Invalid service rating!");
            Input.close();
            return;
        }

        // Calculate the final bill
        FinalBill = Subtotal - DiscountAmount + TipAmount;

        // Convert final bill to a whole number
        WholeAmount = (int) FinalBill;

        // Display the final receipt
        System.out.println("\n===== SMART RESTAURANT RECEIPT =====");
        System.out.println("Customer: " + Name);
        System.out.printf("Meal: $%.2f%n", MealPrice);
        System.out.println("Drink: " + DrinkName);
        System.out.printf("Drinks Cost: $%.2f%n", DrinksCost);
        System.out.printf("Discount: $%.2f%n", DiscountAmount);
        System.out.printf("Tip: $%.2f%n", TipAmount);
        System.out.printf("Final bill: $%.2f%n", FinalBill);
        System.out.println("Whole amount: $" + WholeAmount);
        System.out.println("====================================");

        // Thank the customer
        System.out.println("Thank you for dining with us!");

        // Close Scanner
        Input.close();
    }
}
