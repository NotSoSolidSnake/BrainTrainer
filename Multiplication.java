import java.util.Scanner;
public class Multiplication {

	private String yesOrNo;
	private Scanner userInput = new Scanner(System.in);
	Decide userDecision = new Decide();	

	public void decide() {

		System.out.println("\nWhat kind of problem do you want?");
		System.out.println("\nType 'basic' for basic multiplication tables \n'two' for two-by-one \n'three' for three-by-one\nOr, 'Arthur' for practicing multiplication tables 0-10 only");
		System.out.println("\nType 'home' to go back to the selection screen.\n");
		String input = userInput.nextLine();

		if (input.equalsIgnoreCase("basic"))
			basic();
		if (input.equalsIgnoreCase("two"))
			two();
		if (input.equalsIgnoreCase("three"))
			three();
		if (input.equalsIgnoreCase("arthur"))
			arthur();	
		if (input.equalsIgnoreCase("home"))
			userDecision.startUp();
	}

	private void basic() {

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 13) + 1;
			int secondInt = (int) (Math.random() * 13) + 1;

			int answer = firstInt * secondInt;

			System.out.println("   " + firstInt);
			System.out.println(" * " + secondInt);
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

		for (int x = 0; x < 50; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 100) + 9;
			int secondInt = (int) (Math.random() * 10);

			int answer = firstInt * secondInt;

			while(secondInt < 2)
			{
				secondInt = (int) (Math.random() * 10);
			}

			System.out.println("   " + firstInt);
			System.out.println(" * " + secondInt);
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

		for (int x = 0; x < 50; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 1000) + 90;
			int secondInt = (int) (Math.random() * 10);

			int answer = firstInt * secondInt;

			while(secondInt < 2)
			{
				secondInt = (int) (Math.random() * 10);
			}

			System.out.println("   " + firstInt);
			System.out.println(" * " + secondInt);
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

	private void arthur() {

		for (int x = 0; x < 50; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 11);
			int secondInt = (int) (Math.random() * 11);

			int answer = firstInt * secondInt;

			while(firstInt < 2)
			{
				firstInt = (int) (Math.random() * 10);
			}

			while(secondInt < 2)
			{
				secondInt = (int) (Math.random() * 10);
			}


			System.out.println("   " + firstInt);
			System.out.println(" * " + secondInt);
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
			System.out.println(" * " + secondInt);
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
			decide();
		if (yesOrNo.equalsIgnoreCase("no"))
			return;
		if (yesOrNo.equalsIgnoreCase("menu"))
			decide();
		if (yesOrNo.equalsIgnoreCase("home"))
			userDecision.startUp();	
	}
}