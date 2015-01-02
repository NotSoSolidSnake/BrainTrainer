import java.util.Scanner;
public class PhoneNumberGenerator {

	private String yesOrNo;
	private Scanner userInput = new Scanner(System.in);
	Decide userDecision = new Decide();	

	public void decide() {

		System.out.println("\nWhat kind of number do you want to generate?");
		System.out.println("\nType 'random' if you want a random number, 'area code' if you want a specific area code, or 'final' if you know both the area code and first three digits.");
		System.out.println("Type 'home' to go back to the selection screen.\n");
		String input = userInput.nextLine();

		if (input.equalsIgnoreCase("random"))
			random();
		if (input.equalsIgnoreCase("area code"))
			areaCode();
		if (input.equalsIgnoreCase("final"))
			finalGen();
		if (input.equalsIgnoreCase("home"))
			userDecision.startUp();
	}

	private void random() {

		for (int x = 0; x < 10; x++) {

			int[] numbers = new int[5];
			int[] numbers2 = new int[5];
			int[] numbers3 = new int[5];

			int set1 = (int) (Math.random() * 1000);
			int set2 = (int) (Math.random() * 1000);
			int set3 = (int) (Math.random() * 10000);

			numbers[x] = set1;
			numbers2[x] = set2;
			numbers3[x] = set3;
		}
	}

	private void areaCode() {
	
		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 100);
			int secondInt = (int) (Math.random() * 100);

			int answer = firstInt + secondInt;

			System.out.println("   " + firstInt);
			System.out.println(" + " + secondInt);
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

	private void finalGen() {
	
		for (int x = 0; x < 10; x++) {

			System.out.println();
			Scanner tempAnswer = new Scanner(System.in);

			int firstInt = (int) (Math.random() * 1000);
			int secondInt = (int) (Math.random() * 1000);

			int answer = firstInt + secondInt;

			System.out.println("   " + firstInt);
			System.out.println(" + " + secondInt);
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
		System.out.println(" + " + secondInt);
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