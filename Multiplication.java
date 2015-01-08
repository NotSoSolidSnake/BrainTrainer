import java.util.*;
public class Multiplication {

	private Scanner userInput = new Scanner(System.in);
	Decide userDecision = new Decide();	
	private Random rand = new Random();

	public void decide() {

		System.out.println("\nWhat kind of problem do you want?");
		System.out.println("\nType 'basic' for basic multiplication tables \n'two' for two-by-one \n'three' for three-by-one\nOr, 'Arthur' for practicing multiplication tables 0-10 only");
		System.out.println("\nBonus Mode: Type 'Challenge' for multiplication problems between 6 and 9.");
		System.out.println("\nType 'home' to go back to the selection screen.\n");
		String input = userInput.nextLine();

		if (input.equalsIgnoreCase("basic"))
			basic();
		if (input.equalsIgnoreCase("challenge"))
			challengeArea();		
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

		for (int x = 0; x < 50; x++) {

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

	private void challengeArea() {

		int[] sel1 = {6, 7, 8, 9};
		int[] sel2 = {6, 7, 8, 9};

		for (int x = 0; x < 50; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int y = (int) (Math.random() * 4);	
			int z = (int) (Math.random() * 4);	

			int firstInt = sel1[y];
			int secondInt = sel2[z];

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


			while(secondInt < 2)
			{
				secondInt = (int) (Math.random() * 10);
			}

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

		for (int x = 0; x < 50; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 1000) + 90;
			int secondInt = (int) (Math.random() * 10);


			while(secondInt < 2)
			{
				secondInt = (int) (Math.random() * 10);
			}

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

		for (int x = 0; x < 50; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 11);
			int secondInt = (int) (Math.random() * 11);


			while(firstInt < 2)
			{
				firstInt = (int) (Math.random() * 10);
			}

			while(secondInt < 2)
			{
				secondInt = (int) (Math.random() * 10);
			}

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