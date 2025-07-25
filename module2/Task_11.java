package module2;

interface MathOperation { 
	int operate(int a, int b); 
} 

public class Task_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation ad = (a, b) -> a + b; 
		MathOperation s = (a, b) -> a - b; 
		MathOperation m = (a, b) -> a * b; 
		System.out.println("Add: " + ad.operate(6, 5)); 
		System.out.println("Sub: " + s.operate(8, 5)); 
		System.out.println("Mul: " + m.operate(9, 5));
	}

}
