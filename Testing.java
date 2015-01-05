import java.util.*;
public class Testing {
	
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
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

