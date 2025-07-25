package module3;


abstract class Shape{
	String type;
	abstract double area();
	 void displayShapeType()
	 {
		 System.out.println(type);
	 }
}
class Circle extends Shape{

	double radius;
	
	Circle(double r, String type )
	{
		radius=r;
		super.type=type;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}
class Rectangle extends Shape{
	double l,b;
	Rectangle(double l,double b,String type) {
		this.l=l;
		this.b=b;
		super.type=type;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return l*b;
	}
	
}
public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(3,"circle");
		System.out.println(c.area());
		c.displayShapeType();
		Rectangle r=new Rectangle(3,4,"rectangle");
		System.out.println(r.area());
		r.displayShapeType();
	}

}
