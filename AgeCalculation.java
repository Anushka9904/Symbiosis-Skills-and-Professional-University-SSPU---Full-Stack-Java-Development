package Assignments;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        LocalDate birthdate = LocalDate.of(1890, 12, 2);
		        LocalDate currentDate = LocalDate.now();
		       int age = calculateAge(birthdate, currentDate);
		       System.out.println(" Your age is " + age + " years");
		    }
			public static int calculateAge(LocalDate birthdate, LocalDate currentDate) {
		       Period period = Period.between(birthdate, currentDate);
		         return period.getYears();
		    }
		

	}


