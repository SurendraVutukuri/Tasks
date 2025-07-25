package module1;

import java.util.Scanner;

public class Task_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is the largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is the largest number");
		}
		else
		{
			System.out.println(c+" is the largest number");
		}
		sc.close();
	}

}
