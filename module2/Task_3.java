package module2;

class Bank{
	
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	void deposit(double amount) {
		if(amount >0)
		{
			balance+=amount;
		}
	}
	void withDraw(double amount)
	{
		if(balance>0 &&  balance>=amount)
		{
			balance-=amount;
		}
	}
}
public class Task_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		obj.deposit(3000);
		obj.withDraw(2000);
		System.out.println(obj.getBalance());
	}

}
