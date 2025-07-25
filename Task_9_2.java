package module1;

import java.util.Scanner;

public class Task_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=2,b=3;
		System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div");
		int choose=sc.nextInt();
		switch(choose)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid");
		}
		
		sc.close();
	}

}
