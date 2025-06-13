package Day6;
import java.util.HashMap;
import java.util.Map;
public class Task3 {
	public static void main(String[]args) {
		HashMap<String,Integer> studentMarks=new HashMap();
		studentMarks.put("Hari", 100);
		studentMarks.put("Subash", 90);
		studentMarks.put("Kathir", 80);
		int totalMarks=0;
		for(int marks:studentMarks.values()) {
			totalMarks +=marks;
		}
		System.out.println("Student Total Marks:"+totalMarks);
		double average = totalMarks/studentMarks.size();
		System.out.println("Student Total Percentage:"+average);
		for(Map.Entry<String,Integer>entry:studentMarks.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
		
}
