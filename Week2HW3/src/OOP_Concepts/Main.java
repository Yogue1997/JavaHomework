package OOP_Concepts;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter employee name:");
		String employeeName = scan.nextLine();
		System.out.println("Enter employee age:");
		int employeeAge = scan.nextInt();

		scan.nextLine();
		
		System.out.println("Enter student name:");
		String studentName = scan.nextLine();
		System.out.println("Enter student age:");
		int studentAge = scan.nextInt();
		
		
		Employee employee1 = new Employee(employeeName, employeeAge);
		Student student1 = new Student(studentName, studentAge);
		
		Person1 firstPerson = new Person1();
		
		firstPerson.setAge(34);
		firstPerson.setName("Billy");
		
		System.out.println(firstPerson.getAge());
		System.out.println(firstPerson.getName());
		
//		try {
//		
//		Employee employee1 = new Employee("Youssouf", 24);
//		}
//		catch (Exception ex) {
//			
//			System.out.println(ex.getMessage());			
//		}
//		
	}

}
