package module4;

class BankAccount { 
    int balance = 1000; 
 
    synchronized void withdraw(int amount, String customer) { 
        if (balance >= amount) { 
            balance -= amount; 
            System.out.println("Balance: " + balance); 
        } else { 
            System.out.println(customer + " insufficient funds"); 
        } 
    } 
} 
public class Task_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount account = new BankAccount(); 
		 
	        Runnable user1 = () -> account.withdraw(600, "c1"); 
	        Runnable user2 = () -> account.withdraw(500, "c2"); 
	 
	        new Thread(user1).start(); 
	        new Thread(user2).start();
	}

}
