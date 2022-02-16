package ClassesExamples;

public class Appllication {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "John Smith", "549-93-0022", 5432.34);
//		emp.changeName("John Abraham");
		emp.raiseSalary(2000.00);
		
		
		Manager mgr = new Manager(1, "Barabara Jones", "943-09-0909", 32455.53, "optical");
		
		mgr.raiseSalary(100000.00);
		System.out.println(mgr.getSalary());
		System.out.println(mgr.getDeptName());
//		emp.setName("John Smith");
//		emp.setEmpID(101);
//		emp.setSalary(120345.05);
//		emp.setSsn("001-22-3467");
		Director dir = new Director(5, "Jon Smith", "879-98-0987", 45635.32, "management", 100000000.00, false);
		
		Printer print = new Printer ();
		print.print(dir.getSalary());
		print.print(dir.getDeptName());
		System.out.println("The budget has been: " + dir.isApproved());
		
	}
}


