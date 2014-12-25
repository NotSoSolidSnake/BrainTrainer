import java.util.Scanner;
public class Multiplication {

	private String yesOrNo;
	private Scanner userInput = new Scanner(System.in);

	public void decide() {

		System.out.println("What kind of problem do you want?");
		System.out.println("\nType 'basic' for basic multiplication tables \n'two' for two-by-one \n'three' for three-by-one\nOr, 'Arthur' for practicing multiplication tables 0-10 only");
		String input = userInput.nextLine();

		if (input.equalsIgnoreCase("basic"))
			basic();
		if (input.equalsIgnoreCase("two"))
			two();
		if (input.equalsIgnoreCase("three"))
			three();
		if (input.equalsIgnoreCase("arthur"))
			arthur();	
	}

	private void basic() {

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 13);
			int secondInt = (int) (Math.random() * 13);

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

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 100);
			int secondInt = (int) (Math.random() * 10);

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

	private void three() {

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 1000);
			int secondInt = (int) (Math.random() * 10);

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

	private void arthur() {

		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 11);
			int secondInt = (int) (Math.random() * 11);

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
		System.out.println("Or, type 'menu' to return to the menu.");

		yesOrNo = userInput.nextLine();

		if (yesOrNo.equalsIgnoreCase("yes"))
			basic();
		if (yesOrNo.equalsIgnoreCase("no"))
			return;
		if (yesOrNo.equalsIgnoreCase("menu"))
			decide();
		}
}