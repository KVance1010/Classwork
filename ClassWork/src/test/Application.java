package test;
import ClassesExamples.Employee;
import ClassesExamples.Manager;

public class Application {

	public static void main(String[] args) {
		Employee e = new Employee( 101, " Jim Smith", " 111-11-1111", 100_000.00);
		Manager m = new Manager( 102, "John Kern", " 123-23-1234", 111_100.00, "Marketing");
		
		System.out.println(e.getDetails());
		System.out.println(m.getDetails());
		
		Employee E = new Manager( 103, "John Smith", "123-23-1234", 111_456.00, "Sales");
		
		// aspect of polymorphism called virtual method invocation
		System.out.println(e.getDetails());
		
		  

	}

}
