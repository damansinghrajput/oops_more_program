package test.com;
// Abstract class
public abstract class SunstarAbstractExample {
	abstract void printInfo();
}

// Abstraction performed using extends
class Employeer extends SunstarAbstractExample {
	void printInfo()
	{
		String name = "avinash";
		int age = 21;
		float salary = 222.2F;

		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	
	
	
	
	
	
}

// Base class
class Base {
	public static void main(String args[])
	{
		SunstarAbstractExample s = new Employeer();
		s.printInfo();
	}
}
