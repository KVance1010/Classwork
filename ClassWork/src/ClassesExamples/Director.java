package ClassesExamples;

public class Director extends Manager {
	private double budget;
	private boolean approved;

	public Director(int empID, String name, String ssn, double salary, String deptName, double budget, boolean approved) {
		super(empID, name, ssn, salary, deptName);
		this.budget = budget;
		this.approved = approved;
	}

	public double getBudget() {
		return budget;
	}

	public String isApproved() {
		if (!approved) return "denied";
		return "approved";
	}
	
	

}
