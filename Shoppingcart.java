package Oops;



public class Shoppingcart {

	

	void add_to_cart(String category, int price) {

		System.out.println("your category:"+category);

		System.out.println("Item price:"+price);

		

		

	}

	

void add_to_cart(String category, int price,int quantity) {

		

	int total= price*quantity;

	System.out.println("total="+total);

	}



	public static void main(String[] args) {

		Shoppingcart in=new Shoppingcart();

		in.add_to_cart("shirt",250);

		in.add_to_cart("box", 40,3);

		// TODO Auto-generated method stub



	}



}

