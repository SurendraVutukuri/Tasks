package module3;

public class Task_5_5 extends Exception{
	
	Task_5_5(String msg) { 
		super(msg); 
		} 
} 

class Bank { 
	static void checkBalance(int balance) throws Task_5_5 { 
		if (balance < 0) 
		throw new Task_5_5("Insufficient balance"); 
		else 
		System.out.println(balance); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			checkBalance(-100); 
			} catch (Task_5_5 e) { 
			System.out.println(e.getMessage()); 
			}
	}

}
