import java.util.*;
public class Testing {
	
	public static void main(String[] args) {

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
		}
	}
}
}

