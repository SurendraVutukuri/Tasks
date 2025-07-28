package module4;

public class  MyPrinterThread extends Thread {
	
	void print()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 MyPrinterThread ob=new  MyPrinterThread ();
		 ob.start();
		 for(int i=1;i<=5;i++)
		 {
			 ob.print();
			 ob.sleep(1000);
		 }
		 
	}

}
