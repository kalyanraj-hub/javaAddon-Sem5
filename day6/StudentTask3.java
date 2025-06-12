package javaAddon;
import java.util.*;



public class StudentTask3 {



	public static void main(String[] args) {

		HashMap<String,Integer> stdMk=new HashMap();

		stdMk.put("student1", 100);

		stdMk.put("student2",40);

		stdMk.put("student3",60);

		stdMk.put("student4",70);

		stdMk.put("student5",80);

		

		int totalMark=0;

		for (Map.Entry<String, Integer> entry : stdMk.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		for(int marks:stdMk.values()) {

			totalMark +=marks;

			

		}

		

		System.out.println("Total    = "+totalMark);

		double average=totalMark / stdMk.size();

		System.out.println("Average  :"+average);

	}



}
