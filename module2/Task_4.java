package module2;

abstract class Shape{
	abstract double area();
}
class Circle extends Shape{

	double radius;
	Circle(double r)
	{
		radius=r;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}
class Rectangle extends Shape{
	double l,b;
	Rectangle(double l,double b) {
		this.l=l;
		this.b=b;
		// TODO Auto-generated constructor stub
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return l*b;
	}
	
}
public class Task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(3);
		System.out.println(c.area());
		Rectangle r=new Rectangle(3,4);
		System.out.println(r.area());
	}

}
