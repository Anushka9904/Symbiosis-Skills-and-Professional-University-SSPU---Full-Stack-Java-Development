package HomeworkDiwali;
import java.util.Arrays;
public class nonzeroElements {
	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        int[] num = {1, 0, 2, 0, 3, 0, 4}; 
	        moveZerosToEnd(num);
	        System.out.println("Array after moving zeros to the end: " + Arrays.toString(num));
	    }
	    public static void moveZerosToEnd(int[] nums) {
	        int index = 0; 
	        for (int num : nums) {
	            if (num != 0) {
	                nums[index++] = num;
	            }
	        }
	        while (index < nums.length) {
	            nums[index++] = 0;
	        }
	    }
	}


