package module2;

class Vechile{
	int speed;
	String brand;
	void showDetails()
	{
		System.out.println("Brand: "+brand+" Speed: "+speed);
	}
}
class Car extends Vechile{
	int wheels=4;
	void showDetails()
	{
		System.out.println("Brand: "+brand+" Speed: "+speed+" "+wheels);
	}
}
class Bike extends Vechile{
	int wheels=2;
	void showDetails()
	{
		System.out.println("Brand: "+brand+" Speed: "+speed+" "+wheels);
	}
}
public class Task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(); 
		car.brand = "Honda"; 
		car.speed = 180; 
		car.showDetails(); 
		Bike bike = new Bike(); 
		bike.brand = "Yamaha"; 
		bike.speed = 120; 
		bike.showDetails(); 
	}

}
