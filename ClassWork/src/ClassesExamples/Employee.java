package ClassesExamples;

public class Employee {
	
	private int empID;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee() {
		empID = -1;
		name = "no name";
		ssn = " missing";
		salary = -1.0;
	}
	public Employee(int empID, String name, String ssn, double salary) {
		this.empID = empID;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}
	
	public void changeName(String newName) {
		if (newName != null) {
			this.name = newName;
		}
	}
	
	public void raiseSalary(double increase) {
		this.salary += increase;
	}

//	public void setEmpID(int empID) {
//		this.empID = empID;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getSsn() {
		return ssn;
	}

//	public void setSsn(String ssn) {
//		this.ssn = ssn;
//	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDetails1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
