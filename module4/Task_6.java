package module4;

class Counter{
	int count;
	void increment()
	{
		count++;
	}
}
public class Task_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter c = new Counter(); 
		Thread t1 = new Thread(() -> { 
		for(int i = 0; i < 1000; i++) c.increment(); 
		}); 
		Thread t2 = new Thread(() -> { 
		for(int i = 0; i < 1000; i++) c.increment(); 
		}); 
		t1.start(); t2.start(); 
		t1.join(); t2.join(); 
		System.out.println("Final Count (without sync): " + c.count); 
	}

}
