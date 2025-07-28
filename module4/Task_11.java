package module4;

public class Task_11 extends Thread{
	
	public Task_11(String name) { 
		super(name); 
		} 
		public void run() { 
			for(int i = 1; i <= 5; i++) { 
				System.out.println(getName() + " running " + i); 
			try { 
				Thread.sleep((int)(Math.random() * 1000)); 
			} 
			catch(Exception e) {} 
			} 
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Task_11("Tortoise").start(); 
		new Task_11("Rabbit").start(); 
		new Task_11("Dog").start(); 
	}

}
