package OOP_Concepts;

public class Person implements PersonInterface {
	
	
	String personName;
	int personAge;
	
	
	public Person(String name, int age) {
		personName = name;
		personAge = age;
		System.out.println(calculate(age));
	}

	@Override
	public double calculate(int num) {
		return num + 1;
	}

 
}
