package HomeworkDiwali;

public class Charactervalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String value = "Hello, this is a sample string.";
		        String searchValue = "sample"; 
		        int index = findFirstCharacterIndex(value, searchValue);
		        if (index != -1) {
		            System.out.println("The first occurrence of \"" + searchValue + "\" is at index: " + index);
		        } else {
		            System.out.println("\"" + searchValue + "\" not found in the given string.");
		        }
		    }
		    public static int findFirstCharacterIndex(String value, String searchValue) {
		        return value.indexOf(searchValue); 
		    }
	}


