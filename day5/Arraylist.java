package java_addon;
import java.util.ArrayList;



//collection

public class ArrayList1 {



	public static void main(String[] args) {

		ArrayList<Integer> arr=new ArrayList();

		ArrayList<Object> arr4=new ArrayList();

		arr.add(10);

		arr.add(20);

		arr.add(30);

		arr.add(40);

		arr.add(50);

		arr.forEach(num->System.out.println(num*num));

		arr.forEach(age->{

			if (age>=18) {

				System.out.println("Allowed to vote");

			}

			else {

				System.out.println(" Not Allowed to vote");

			

			}

		}

		arr4.add("soma");

		arr4.add("Chandran");

		System.out.println(arr);

		System.out.println(arr4);

	}



}

