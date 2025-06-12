
import java.util.*;



public class StudentTask3 {



	public static void main(String[] args) {

		HashMap<String,Integer> stdMk=new HashMap();

		stdMk.put("John", 100);

		stdMk.put("ram",100);

		stdMk.put("hari",50);

		

		int totalMark=0;

		for(int marks:stdMk.values()) {

			totalMark +=marks;

			

		}

		

		System.out.println(totalMark);

	}



}
