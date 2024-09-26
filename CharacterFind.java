package Assignments;
import java.util.*;
import java.util.Scanner;
public class CharacterFind {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      char ch;
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Input a character: ");
		      ch = sc.next().charAt(0);
		     if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		    {
		     System.out.println("This is an alphabet.");
		    }
		    else if(ch>='0' && ch<='9')
		    {
		     System.out.println("This is a digit.");
		    }
		    else
		    {
		    System.out.println("This is a symbol.");
		    }
		}
		
	}


