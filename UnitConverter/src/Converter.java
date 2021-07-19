import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			int menuSelection;
			System.out.println("Please type in a menu selction and hit Enter.");
			
			System.out.println("1: Length conversions");
			System.out.println("2: Volume conversions");
			System.out.println("3: Area conversions");
			System.out.println("4: Time conversions");
			menuSelection = scanner.nextInt();
			System.out.println("You have entered: " + menuSelection);
			scanner.close();
			
			
	}
	

}
