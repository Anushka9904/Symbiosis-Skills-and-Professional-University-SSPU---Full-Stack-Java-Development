package HomeworkDiwali;
import java.util.Scanner;
public class SearchFrom2Dmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number to search: ");
		        int target = sc.nextInt();
		        for (int i = 0; i < mat.length; i++) {
		            for (int j = 0; j < mat[i].length; j++) {
		                if (mat[i][j] == target) {
		                    System.out.println("Number " + target + " found at row " + i + " and column " + j);
		                    return; 
		                }
		            }
		        }
		        System.out.println("Number " + target + " not found in the matrix.");
		    }
		}
