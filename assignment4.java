//write a java program to swap two numbers
package Assignments;

import java.util.Scanner;

public class assignment4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
       
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Swap using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        // Display the swapped numbers
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        
        sc.close();
    }
}

