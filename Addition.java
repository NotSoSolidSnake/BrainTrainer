import java.util.Scanner;
public class Addition {

	public Addition() {

		Scanner userInput = new Scanner(System.in);
		System.out.println("\nInput the amount of integers in your additin problem\n");
		int input = userInput.nextInt();

		if (input == 1)
			one();
		if (input == 2)
			two();
		if (input == 3)
			three();
	}


	public void one() {

		while (true) {

		System.out.println();
		Scanner tempAnswer = new Scanner(System.in);

		int firstInt = (int) (Math.random() * 9);
		int secondInt = (int) (Math.random() * 9);

		int answer = firstInt + secondInt;

		System.out.println("   " + firstInt);
		System.out.println(" + " + secondInt);
		System.out.println("-------------");

		System.out.println("\nWhat is the answer to the problem?");
		int input = tempAnswer.nextInt();

		if (input == answer)
			System.out.println("\nGood\n");
		else
			System.out.println("\nWrong\n");
		}
	}

	public void two() {

		while (true) {

		System.out.println();
		Scanner tempAnswer = new Scanner(System.in);

		int firstInt = (int) (Math.random() * 99);
		int secondInt = (int) (Math.random() * 99);

		int answer = firstInt + secondInt;

		System.out.println("   " + firstInt);
		System.out.println(" + " + secondInt);
		System.out.println("-------------");

		System.out.println("\nWhat is the answer to the problem?");
		int input = tempAnswer.nextInt();

		if (input == answer)
			System.out.println("\nGood\n");
		else
			System.out.println("\nWrong\n");

		}
	}

	public void three() {

		while (true) {

		System.out.println();
		Scanner tempAnswer = new Scanner(System.in);

		int firstInt = (int) (Math.random() * 999);
		int secondInt = (int) (Math.random() * 999);

		int answer = firstInt + secondInt;

		System.out.println("   " + firstInt);
		System.out.println(" + " + secondInt);
		System.out.println("-------------");

		System.out.println("\nWhat is the answer to the problem?");
		int input = tempAnswer.nextInt();

		if (input == answer)
			System.out.println("\nGood\n");
		else
			System.out.println("\nWrong\n");

		}
	}
}