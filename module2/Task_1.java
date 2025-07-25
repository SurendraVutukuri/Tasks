package module2;


class Book{
	String title,author;
	double price;
	void displayDetails()
	{
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		b1.title="Origin";
		b1.author="Grece";
		b1.price=2300;
		Book b2=new Book();
		b2.title="Cricket";
		b2.author="Dravid";
		b2.price=2000;
		b1.displayDetails();
		b2.displayDetails();
		
	}

}
