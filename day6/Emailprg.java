package day6;
import java.util.*;

public class EmailProg {

	public static void main(String[] args) {
		HashMap<String,String> email=new HashMap();
		email.put("John", "john@gmail.com");
		email.put("ram","ram@gmail.com");
		email.put("hari","hari@gmail.com");
		
		
		for (Map.Entry<String, String> entry : email.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
