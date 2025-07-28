package module4;

public class Task_4 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task_4 ob=new Task_4();
		System.out.println(ob.isAlive());
		ob.start();
		System.out.println(ob.isAlive());
		try {
			ob.join();
			System.out.println(ob.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
