package day4;

class sbiAcc{

	private String Accholder;

	private int Balance;

	

	 sbiAcc(String Accholder,int Balance){

		this.Accholder=Accholder;

		this.Balance=Balance;

		

	}

	 public String getAccholder() {

		return Accholder;

		 

	 }

	 public int getBalance() {

		return Balance;

		 

	 }

	 public void Deposit(int dep) {

		 if(Balance >0 ) {

			 Balance += dep;//balance = balance+dep;

			 System.out.println("Deposite Amount:"+dep);

			 System.out.println("Current Balance :"+Balance);

		 }}

		 public void setAccholder(String Accholder) {

			 this.Accholder=Accholder;

			 

		 }

		 public void setwithdraw(int withdraw) {

			 

		 }

	 }

	 





public class BankDetails {



	public static void main(String[] args) {

		sbiAcc ac=new sbiAcc("john",20000);

		System.out.println("Account holder name:"+ac.getAccholder());

		ac.setAccholder("pavithra");

		System.out.println("update account number:"+ac.getAccholder());

		System.out.println("Current Balance :"+ac.getBalance());

		ac.Deposit(30000);

		ac.setwithdraw(20000);
		System.out.println("Avail Balance:"+ac.getBalance());



	}



}
