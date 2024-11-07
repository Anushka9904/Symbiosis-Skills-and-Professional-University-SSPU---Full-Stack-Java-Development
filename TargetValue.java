package HomeworkDiwali;

public class TargetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 7, 11, 15}; 
		        int target = 9; 
		        int[] result = findTwoSum(numbers, target);
		        if (result != null) {
		            System.out.println("Indices of elements that add up to " + target + " are: " + result[0] + " and " + result[1]);
		        } else {
		            System.out.println("No two elements add up to the target sum.");
		        }
		    }
		    public static int[] findTwoSum(int[] nums, int target) {
		        for (int i = 0; i < nums.length; i++) {
		            for (int j = i + 1; j < nums.length; j++) {
		                if (nums[i] + nums[j] == target) {
		                    return new int[] { i, j }; 
		                }
		            }
		        }
		        return null;
		    }
	}

