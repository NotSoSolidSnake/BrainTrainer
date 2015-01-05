import java.util.Scanner;
public class Decide {

	public void startUp() {

	Scanner input = new Scanner(System.in);
	Addition add = new Addition();
	Subtraction subtract = new Subtraction();
	Multiplication multiply = new Multiplication();
	PhoneNumberGenerator number = new PhoneNumberGenerator();

	System.out.println("\nWelcome to the Brain Trainer Program!\n");
	System.out.println("Here are your choice of challenges: \nAddition \nSubtraction\nMultiplication\nMemorize Phone Number");
	System.out.println("\nWhat would you like to do?\n");

	String choice = input.nextLine();

	if (choice.equalsIgnoreCase("addition") || choice.equalsIgnoreCase("add") )
		add.decide();
	if (choice.equalsIgnoreCase("subtraction") || choice.equalsIgnoreCase("subtract") )
		subtract.decide();
	if (choice.equalsIgnoreCase("multiplication") || choice.equalsIgnoreCase("multiply") )
		multiply.decide();
	if (choice.equalsIgnoreCase("phone number") || choice.equalsIgnoreCase("number") )
		number.decide();
	}
}