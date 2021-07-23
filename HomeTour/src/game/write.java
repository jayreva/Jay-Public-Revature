package game;

import java.util.Scanner;

public class write {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your next notepad entry:");
	notepad.append(scan.nextLine());
	scan.close();
	System.out.println("Your new notepad looks like: " + notepad);
}
