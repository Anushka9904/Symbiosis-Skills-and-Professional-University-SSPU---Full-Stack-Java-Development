//write a menu driven program for basic mathematical operation in java
package Assignments;
	import java.util.Scanner;
	public class assignment2 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        
	        do {
	            
	            System.out.println("Menu:");
	            System.out.println("1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Divide");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice (1-5): ");
	            
	            
	            n = sc.nextInt();
	            
	            switch (n) {
	                case 1:
	                    Add(scanner);
	                    break;
	                case 2:
	                    Subtract(scanner);
	                    break;
	                case 3:
	                    Multiply(scanner);
	                    break;
	                case 4:
	                    Divide(scanner);
	                    break;
	                case 5:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	            
	        } while (n != 5); 
	        
	        sc.close();
	    }

	    private static void Add(Scanner scanner) {
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();
	        double result = num1 + num2;
	        System.out.println("Result: " + result);
	    }

	    private static void Subtract(Scanner scanner) {
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();
	        double result = num1 - num2;
	        System.out.println("Result: " + result);
	    }

	    private static void Multiply(Scanner scanner) {
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();
	        double result = num1 * num2;
	        System.out.println("Result: " + result);
	    }

	    private static void Divide(Scanner scanner) {
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();
	        
	        
	        if (num2 == 0) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } else {
	            double result = num1 / num2;
	            System.out.println("Result: " + result);
	        }
	    }
	}

//double is used for initialising any no that can be decimal
