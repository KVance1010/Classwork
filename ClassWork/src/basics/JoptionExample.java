package basics;
import javax.swing.JOptionPane;

public class JoptionExample {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter the month number: ");
		int monthNumber = Integer.parseInt(input);
		
		if (monthNumber >= 1 && monthNumber <= 3 ) {
			JOptionPane.showInputDialog("You are in quarter 1");
			//System.out.println("You are in quarter 1");
		}
		else if ( monthNumber >= 4 && monthNumber <= 6) {
			System.out.println("You are in Quarter 2");
		}
		else {
			System.out.println("You are not in the first half of the year");
		}
		

	}

}
