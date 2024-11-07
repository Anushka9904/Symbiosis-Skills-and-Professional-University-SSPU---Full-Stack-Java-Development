package HomeworkDiwali;

public class DuplicateOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		        int[] num= {1, 2, 3, 4,8, 5, 3,8, 2,7,7}; 
		        System.out.println("Duplicate element are:");
		        for(int i=0;i<num.length;i++){
		            for(int j=i+1;j<num.length;j++){
		                if(num[i]==num[j]){
		                    System.out.println(num[i]);
		                    break; 
		                    }
		    }
		    }
		    }
		

	}

