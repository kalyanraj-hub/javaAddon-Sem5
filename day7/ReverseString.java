package day7;
import java.util.Scanner;

public class ReverseString {

	public static void main(java.lang.String[] args) {
		

		
		   
	 Scanner sr = new Scanner(System.in);
		        
		        System.out.print("Enter a string: ");
		        String original = sr.nextLine();
		        
		        
		        char[] chars = original.toCharArray();
		        
		        System.out.print("Reversed string: ");
		        for (int i = chars.length - 1; i >= 0; i--) {
		            System.out.print(chars[i]);
		        }
		        
		        sr.close();
	


	}

}