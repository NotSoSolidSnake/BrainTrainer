import java.util.Scanner;
public class Subtraction {

	private String yesOrNo;
	private Scanner userInput = new Scanner(System.in);
	Decide userDecision = new Decide();	

	public void decide() {

		System.out.println("\nHow many integers do you want in your problem?");
		System.out.println("\nType 'one', 'two', or 'three'.");
		System.out.println("Type 'home' to go back to the selection screen.\n");
		String input = userInput.nextLine();

		if (input.equalsIgnoreCase("one"))
			one();
		if (input.equalsIgnoreCase("two"))
			two();
		if (input.equalsIgnoreCase("three"))
			three();
		if (input.equalsIgnoreCase("home"))
			userDecision.startUp();		
	}

	private void one() {

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 10);
			int secondInt = (int) (Math.random() * 10);

			int answer = firstInt - secondInt;

			System.out.println("   " + firstInt);
			System.out.println(" - " + secondInt);
			System.out.println("-------------");

			System.out.println("\nWhat is the answer to the problem?");
			int input = tempAnswer.nextInt();

			if (input == answer)
				System.out.println("\nGood\n");
			else {
				System.out.println("\nWrong\n");
				recursiveLoop(firstInt, secondInt, answer);
			}
		}
		repeat();
	}

	private void two() {

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 10);
			int secondInt = (int) (Math.random() * 10);

			int answer = firstInt - secondInt;

			System.out.println("   " + firstInt);
			System.out.println(" - " + secondInt);
			System.out.println("-------------");

			System.out.println("\nWhat is the answer to the problem?");
			int input = tempAnswer.nextInt();

			if (input == answer)
				System.out.println("\nGood\n");
			else {
				System.out.println("\nWrong\n");
				recursiveLoop(firstInt, secondInt, answer);
			}
		}	
		repeat();
	}

	private void three() {

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 10);
			int secondInt = (int) (Math.random() * 10);

			int answer = firstInt - secondInt;

			System.out.println("   " + firstInt);
			System.out.println(" - " + secondInt);
			System.out.println("-------------");

			System.out.println("\nWhat is the answer to the problem?");
			int input = tempAnswer.nextInt();

			if (input == answer)
				System.out.println("\nGood\n");
			else {
				System.out.println("\nWrong\n");
				recursiveLoop(firstInt, secondInt, answer);
			}
		}
		repeat();
	}

	private int recursiveLoop(int firstInt, int secondInt, int answer) {

			Scanner tempAnswer = new Scanner(System.in);

			System.out.println("   " + firstInt);
			System.out.println(" - " + secondInt);
			System.out.println("-------------");

			System.out.println("\nWhat is the answer to the problem?");

			int input = tempAnswer.nextInt();

			if (input == answer) 
			{
				System.out.println("\nGood\n");
				return answer; 
			}
			else {
				System.out.println("\nWrong\n");
				recursiveLoop(firstInt, secondInt, answer);				
			}
			return 0;
	}		

	private void repeat() {

		System.out.println("Do you want to keep going?");
		System.out.println("Yes to continue. No to quit.\n");
		System.out.println("Type 'menu' to return to the menu \nor 'home' to go back and choose a different problem");

		yesOrNo = userInput.nextLine();

		if (yesOrNo.equalsIgnoreCase("yes"))
			one();
		if (yesOrNo.equalsIgnoreCase("no"))
			return;
		if (yesOrNo.equalsIgnoreCase("menu"))
			decide();
		if (yesOrNo.equalsIgnoreCase("home"))
			userDecision.startUp();		
	}
}