
public class Stringoperations {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sting sb: " + sb);
		sb.append(" world");
		System.out.println("string sb " + sb);
		sb.append("!").append(" are").append(" you");
		System.out.println("string sb: "+ sb);
		sb.insert(12, "How");
		System.out.println(sb);
		System.out.println("length "+ sb.length());
		// get substring
		
		System.out.println("Sub "+ sb.substring(0,5));
		

	}

}
