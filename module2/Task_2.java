package module2;

class Employee{
	static int count;
	String name;
	Employee(String name){
		this.name=name;
		count++;
	}
	static void showEmp()
	{
		System.out.println("No.of Employees: "+count);
	}
}
public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("surendra");
		Employee e2=new Employee("mani");
		Employee.showEmp();;
	
	}

}
