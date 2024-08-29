//write a java program to find a remainer without using mode operator

package Assignments;
//a - (b * quotient) formula 
public class remainderWithoutmodulus {
    public static void main(String[] args) {
        int dividend = 50; 
        int divisor = 5;   

        
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
            return;
        }

        int remainder = remainder(dividend, divisor);
        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is: " + remainder);
    }

    public static int remainder(int a, int b) {
        
        int quotient = a / b;
        // Calculating the remainder using the formula
        int remainder = a - (b * quotient);
        return remainder;
    }
}


