package basics;
import ClassesExamples.Employee;

public class ObjectPassTest {

	public static void main(String[] args) {
		ObjectPassTest test = new ObjectPassTest();
		Employee x = new Employee();
		x.setSalary(100);
		System.out.println("Employee Salary: " + x.getSalary());
		test.foo (x);
		System.out.println("Employee Salary: " + x.getSalary());

	}

	public void foo (Employee y) {
		y.setSalary(500);
		y = new Employee();
		y.setSalary(2000);
	} // object y scope ends here
}
