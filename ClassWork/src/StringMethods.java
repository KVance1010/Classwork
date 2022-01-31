
public class StringMethods {

	public static void main(String[] args) {
		
		// declaring String variables 
		String testCase = new String ("This is to test the different string options one and Two");
		String testOne = new String ("One");
		String testTwo = new String ("one");
		String testThree = new String ("Two");
		
		// CharAt()  ...    returns the char at the specified index    ... returns a char   
		System.out.println("\ncharAt()");
		System.out.println(testCase.charAt(5));
		System.out.println(testCase.charAt(0));
		System.out.println((testCase.charAt(8)) + (testCase.charAt(9)));
		
		// compareTo()   ...    compares two string lexicon graphically   ...  returns a int
		System.out.println("\ncompareTo()");
		System.out.println(testOne.compareTo(testTwo));
		System.out.println(testTwo.compareTo("One"));
		System.out.println(testThree.compareTo(testThree));
		
		// compareToIgnoreCase() ...  compares two strings lexicon graphically ignoring the case   ...   returns a int
		System.out.println("\ncompareToIgnoreCase()");
		System.out.println(testOne.compareToIgnoreCase(testTwo));
		System.out.println(testOne.compareToIgnoreCase(testThree));
		
		// equals() ... compares two strings ignoring case ... boolean
		System.out.println("\nequals ()");
		System.out.println(testOne.equals(testTwo));
		System.out.println(testOne.equals(testThree));
		
		// concat()  ...   appends a string       ...     returns a string
		System.out.println("\nconcat()");
		System.out.println(testCase.concat(" not sure why you would use this option."));
		
		// contains()    ...   checks a sequence of characters     ...   returns a boolean
		System.out.println("\ncontains()");
		System.out.println(testCase.contains("string"));
		System.out.println(testCase.contains("dif"));
		System.out.println(testCase.contains(testThree));
		
		// contentEquals()  ... checks for an exact sequence of characters    ... returns a boolean
		System.out.println("\ncontentsEquals()");
		System.out.println(testCase.contentEquals("string"));
		System.out.println(testCase.contentEquals("dif"));
		System.out.println(testCase.contentEquals(testThree));
		System.out.println(testTwo.contentEquals(testTwo));
		
		// endWith()  ... checks whether a string end with the specified char    ... returns a boolean
		System.out.println("\nendWith()");
		System.out.println(testCase.endsWith("two"));
		System.out.println(testCase.endsWith("Two"));
		System.out.println(testCase.endsWith(testThree));
		
		// 
	
}}
