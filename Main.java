import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int choice;
    int num1;
    int num2;

    System.out.println("--Calculator--\n");
    System.out.println("Menu:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Modulo\n");

    System.out.print("Enter your choice: ");
    choice = in.nextInt();

    switch (choice) {
      case 1: // Addition
        System.out.println("Enter two numbers to add: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("\nThe sum is: " + (num1 + num2));
        break;

      case 2: // Subtraction
        System.out.println("Enter two numbers to subtract: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("\nThe difference is: " + (num1 - num2));
        break;

      case 3: // Multiplication
        System.out.println("Enter two numbers to multiply: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("\nThe product is: " + (num1 * num2));
        break;

      case 4: // Division
        System.out.println("Enter two numbers to divide: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("\nThe quotient is: " + (num1 / num2));
        break;

      case 5: // Modulo
        System.out.println("Enter two numbers to find the remainder: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("\nThe remainder is: " + (num1 % num2));
        break;

      default: // WRONG
        System.out.println("Invalid choice.");
        break;
    }

  }

}