package java_addon;
import java.io.*;



public class ThrowException {

	

	public static void main(String[] args) {

	String filename="C:\\Users\\TEMP\\Documents\\sample.txt";

	try(BufferedReader br=new BufferedReader(new FileReader(filename))) {

		String Line;

		if ((Line = br.readLine()) !=null) {

			System.out.println(Line);

		}

	}

	

	catch(Exception e){

		System.out.println("file not found");

		

	}

	}



}
