package features;

public class CachesString {
	private String message;
	
	public void add (String message) {
		this.message = message;
	}
	
	public String get () {
		return this.message;
	}

}
