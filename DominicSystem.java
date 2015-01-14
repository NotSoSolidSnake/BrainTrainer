import java.util.Random;
import java.util.Scanner;
public class DominicSystem {

	private Scanner userInput = new Scanner(System.in);
	Decide userDecision = new Decide();	
	private Random rand = new Random();

	public void decide() {

		System.out.println("\nThis section of the program will generate 50 random number combinations between 0-100 to practice the Dominic System on");
		System.out.println("\nType 'go' to begin.");
		System.out.println("\nType 'home' to go back to the selection screen.\n");
		String input = userInput.nextLine();

		if (input.equalsIgnoreCase("go"))
			random();
		if (input.equalsIgnoreCase("home"))
			userDecision.startUp();
	}

	private void random() {

		for(int x = 0; x < 50; x++) {

			System.out.println();

			int num1 = rand.nextInt (10);
			int num2 = rand.nextInt (10);

			System.out.printf("%s%s", num1,num2);
		}		
		System.out.println();
		repeat();
	}

	private void repeat() {

		String yesOrNo;
		System.out.println("Do you want to keep going?");
		System.out.println("Yes to continue. No to quit.\n");
		System.out.println("Type 'menu' to return to the menu \nor 'home' to go back and choose a different problem");

		yesOrNo = userInput.nextLine();

		if (yesOrNo.equalsIgnoreCase("yes"))
			decide();
		if (yesOrNo.equalsIgnoreCase("no"))
			return;
		if (yesOrNo.equalsIgnoreCase("menu"))
			decide();
		if (yesOrNo.equalsIgnoreCase("home"))
			userDecision.startUp();	
	}
}