package basics;

public class Array {

	public static void main(String[] args) {
		String [] names = new String[3];
		names[0] = "blue shirt";
		names[1]= "Red shirt";
		names[2] = " Black Shirt";
		
		int [] numbers = {100, 200, 300};
		for (String name: names) {
			System.out.println("Name " + name);
		}
		
		System.out.println("******************");
		
		for (int number: numbers) {
			System.out.println("Number "+ number);;
		}
	}

}
