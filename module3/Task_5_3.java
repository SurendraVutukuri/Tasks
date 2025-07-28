package module3;

public class Task_5_3 {
	static void validateAge(int age) throws Exception { 
		if (age < 18) 
		{
			throw new Exception("You must be above 18"); 
		}
		else {
			System.out.println("you can vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			validateAge(16); 
			} catch (Exception e) { 
			System.out.println(e.getMessage()); 
			}
	}

}
