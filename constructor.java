package Oops;

public class defaultConstructor {

	

	 String name;

	 int year;

	

	defaultConstructor(String name,int year){

		this.name=name;

		this.year=year;

		System.out.println("DefaultConstructor:"+name+" "+year);

	}



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		defaultConstructor ref=new defaultConstructor("java",1995);



	}



}
