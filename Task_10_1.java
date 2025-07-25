package module1;

import java.util.Scanner;

public class Task_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;
		int a[] =new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("avg : "+ sum/a.length);
		System.out.println("min :"+min +" max :"+max);
		sc.close();
	}

}
