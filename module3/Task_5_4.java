package module3;

public class Task_5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			int[] arr = new int[5]; 
			arr[5] = 100 / 0; 
			} catch (ArithmeticException e) { 
			System.out.println(e); 
			} catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println(e); 
			}
	}

}
