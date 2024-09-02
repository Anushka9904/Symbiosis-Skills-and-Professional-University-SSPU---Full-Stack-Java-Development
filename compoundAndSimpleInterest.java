package Assignments;
import java.util.Scanner;

public class compoundAndSimpleInterest {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time: ");
        double time = sc.nextDouble();
        System.out.println("Enter the number of times interest is compounded: ");
        int n = sc.nextInt();
        double simpleInterest = principal * (rate / 100) * time;
        double compoundInterest = principal * Math.pow(1 + (rate / 100) / n, n * time) - principal;
        System.out.println("Enter the Simple Interest: " + simpleInterest);
        System.out.println("Enter the Compound Interest " + compoundInterest);
        
    }
}
