import java.util.Random;
import java.util.Scanner;
public class PhoneNumberGenerator {

	private String yesOrNo;
	private Scanner userInput = new Scanner(System.in);
	Decide userDecision = new Decide();	
	Random rand = new Random();

	public void decide() {

		System.out.println("\nWhat kind of number do you want to generate?");
		System.out.println("\nType 'random' if you want a random number, \n'area code' if you want a specific area code, \nor 'final' if you know both the area code and first three digits.");
		System.out.println("\nType 'home' to go back to the selection screen.\n");
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

		for(int x = 0; x < 10; x++) {

			System.out.println();

			int num1 = rand.nextInt (900) + 100;
			int num2 = rand.nextInt (900) + 100;
			int num3 = rand.nextInt (9000) + 1000;

			System.out.printf("%s-%s-%s", num1,num2,num3);
		}		
		System.out.println();
		repeat();
	}

	private void areaCode() {
	
		System.out.println();
		Scanner areaCode = new Scanner(System.in);
		System.out.println("Input your area code: ");
		int num1 = areaCode.nextInt();		

		for(int x = 0; x < 10; x++) {

			System.out.println();

			int num2 = rand.nextInt (900) + 100;
			int num3 = rand.nextInt (9000) + 1000;

			System.out.printf("%s-%s-%s", num1,num2,num3);
		}
		System.out.println();
		repeat();
	}

	private void finalGen() {
	
		System.out.println();
		Scanner areaCode = new Scanner(System.in);
		System.out.println("Input your area code: ");
		int num1 = areaCode.nextInt();		

		System.out.println("Input the next three digits: ");
		int num2 = areaCode.nextInt();		

		for(int x = 0; x < 10; x++) {

			System.out.println();

			int num3 = rand.nextInt (9000) + 1000;

			System.out.printf("%s-%s-%s", num1,num2,num3);
		}
		System.out.println();
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