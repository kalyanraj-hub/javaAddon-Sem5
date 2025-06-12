package javaAddon;
import java.util.*;

public class LinkedListtask2 {

	public static void main(String[] args) {
		LinkedList<Object> vn=new LinkedList();
		
		
		vn.add("ram");
		vn.add("B");
		vn.add("computer science");
		vn.add("3 Year");
		vn.add(0,"john");
		vn.add(0,"Hari");                                                
		for(Object data:vn) {
			System.out.println(data);
		}

	}

}
