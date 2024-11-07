package HomeworkDiwali;

public class adjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String input = "aabbaceeff";
		        String result = removeAdjacentDuplicates(input);
		        System.out.println("String after removing adjacent duplicates: " + result);
		    }
		    public static String removeAdjacentDuplicates(String s) {
		        StringBuilder result = new StringBuilder(); 
		        for (int i = 0; i < s.length(); i++) {
		            char currentChar = s.charAt(i);
		            if (result.length() > 0 && result.charAt(result.length() - 1) == currentChar) {
		                result.deleteCharAt(result.length() - 1); 
		            } else {
		                result.append(currentChar); 
		            }
		        }
		        return result.toString(); 
		    }
	}


