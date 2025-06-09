package Oops;



public class Singlelevel {

	void Message() {

	System.out.println("this super class ");

	}}

	class subclass extends Singlelevel {

		void View() {

		System.out.println("this is sub class");

		}

	} 

class main{

	public static void main(String[] args) {

		subclass ref=new subclass();

		ref.Message();

		ref.View();

		

		

	

	}



}
