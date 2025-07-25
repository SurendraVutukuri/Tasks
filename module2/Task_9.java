package module2;
import model.Student;
import service.StudentService;
public class Task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(); 
		s.name = "Arjun"; 
		s.age = 21; 
		StudentService ss = new StudentService(); 
		ss.StudentDetails(s);
	}

}
