package ClassesExamples;

public class Manager extends Employee {
	private String deptName;
	
	public Manager(int empID, String name, String ssn, double salary,String deptName) {
		super( empID, name,  ssn,  salary);
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
	}
	
	public String getDetails() {
		return super.getDetails() + " Dept " + deptName;
	}
	

}
