package Assignments;
import java.util.Scanner;
public class CalculatingGradesOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade;
		Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the marks : ");
		        int marks = sc.nextInt();
		        
		        if (marks >= 90) 
		        {
		            grade = "A+";
		        } 
		        else if (marks >= 80)
		        {
		            grade = "B+";
		        } 
		        else if (marks >= 70)
		        {
		            grade = "C+";
		        } 
		        else if (marks >= 60) 
		        {
		            grade = "D";
		        } 
		        else if (marks >= 50)
		        {
		            grade = "E";
		        } 
		        else
		        {
		            grade = "Fail- work hard next time";
		        }
		        
		        System.out.println("Grade is: " + grade);
	}

}
