package module1;

import java.util.Scanner;

public class Task_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		do {
			System.out.println("Enter a number to stop(-1)");
			a=sc.nextInt();
		}while(a!=-1);
		sc.close();
	}

}
