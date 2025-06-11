package java_addon;
import java.util.*;



public class task1 {



	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			try{

				System.out.println("enter the number 1:");

				

				int a= in.nextInt();

				System.out.println("enter the number 2:");

				

				int b=in.nextInt();

				int T;

				T= a/b;

				

			

			

			System.out.println("the answer is:"+T);

			}

			catch( Exception e) {

				System.out.println("Zero is not divide by a number");

				

			}

			finally {

				System.out.println("the end");

			}
		}

	}



}
