package day4;

	
class system{
	private String name;
    private	int marks;
    
	
	system(String name,int marks){
		this.name=name;
		this.marks=marks;
		
			
		System.out.println("your name"+"  "+name);
		System.out.println("marks"+"  "+marks);
		if(marks>=40) {
		System.out.println("result pass ");
		}
		else {
			System.out.println("result fail");
		}
	}
	
public class student {
	

	public static void main(String[] args) {
		system a2=new system("bharath",99);

	}

}
}
