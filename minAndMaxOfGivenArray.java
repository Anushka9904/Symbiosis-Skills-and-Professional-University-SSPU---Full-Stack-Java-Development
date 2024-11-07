package HomeworkDiwali;

public class minAndMaxOfGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] num = {10, 5, 20, 8, 15}; 
		        int min = num[0];
		        int max = num[0];
		        int minIndex = 0;
		        int maxIndex = 0;
		        for (int i = 1; i < num.length; i++) {
		            if (num[i] < min) {
		                min = num[i];
		                minIndex = i;
		            }
		            if (num[i] > max) {
		                max = num[i];
		                maxIndex = i;
		            }
		        }
		        System.out.println("Minimum element is " + min + " at index " + minIndex);
		        System.out.println("Maximum element is " + max + " at index " + maxIndex);
		    
		}

	}


