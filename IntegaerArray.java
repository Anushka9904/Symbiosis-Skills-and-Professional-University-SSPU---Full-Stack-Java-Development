package HomeworkDiwali;

public class IntegaerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] numbers = {0, 1, 0, 3, 12};
		        moveZerosToEnd(numbers);
		        System.out.print("Array after moving zeros to the end: ");
		        for (int num : numbers) {
		            System.out.print(num + " ");
		        }
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


