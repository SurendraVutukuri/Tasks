package module4;

public class RunnableCounter implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RunnableCounter ob=new  RunnableCounter();
		 ob.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}

}
