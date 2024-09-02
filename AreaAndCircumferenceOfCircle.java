package Assignments;
import java.util.Scanner;
public class AreaAndCircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double pi=3.14,area,circum;
    int r;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle : ");
    r=sc.nextInt();
    area=pi*r*r;
    circum=2*pi*r;
    System.out.println("Area of circle is : " + area);
    System.out.println("Circumference of circle is : " + circum);
	}

}
