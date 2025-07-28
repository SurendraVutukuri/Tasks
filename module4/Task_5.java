package module4;

public class Task_5 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task_5 ob1=new Task_5();
		Task_5 ob2=new Task_5();
		Task_5 ob3=new Task_5();
		ob1.setPriority(Thread.MAX_PRIORITY);
		ob2.setPriority(Thread.MIN_PRIORITY);
		ob3.setPriority(Thread.NORM_PRIORITY);
		System.out.println(ob1.getPriority());
		System.out.println(ob2.getPriority());
		System.out.println(ob3.getPriority());
	}

}
