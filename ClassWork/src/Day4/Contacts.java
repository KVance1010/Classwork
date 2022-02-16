package Day4;

public final class Contacts {
	
	private final String firstName;
	private final String lastName;
	
	public Contacts(String fName, String lname) {
		this.firstName = fName;
		this.lastName = lname;
	}
	

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return firstName + " " + lastName + " - " + lastName;
	}

}
