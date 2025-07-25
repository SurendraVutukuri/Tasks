package module1;

public class Task_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,num=2;
		while(c<10)
		{
			boolean b=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					b=false;
					break;
				}
				
			}
			if(b)
				{
					System.out.println(num);
					c++;
				}
				num++;
		}
	}

}
