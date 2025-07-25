package module3;

interface RemoteControl {
	void  turnOn();
	default void  batteryStatus() {
		System.out.println("Battery Status: ");
	}
	static void info() {
		System.out.println("Remote");
	}
}

class Tv implements RemoteControl{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Smart Tv Turn On");
	}
	public void  batteryStatus() {
		System.out.println("Battery Status: 90%");
	}
	
}
interface Printable{
	
}
interface Scannable{
	
}
class MultiplefunctionPrinter implements Printable,Scannable{
	
}
public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv ob=new Tv();
		ob.turnOn();
		ob.batteryStatus();
		RemoteControl.info();
	}

}
