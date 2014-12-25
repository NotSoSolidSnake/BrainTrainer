public interface ArithmeticInterface {

	void decide();
	// This method asks the user what they want to do

	void one();
	// Generates math problems with one digit.

	void two();
	// Generates math problems with two digits.

	void three();
	// Generates math problems with three digits.

	int recursiveLoop(int firstInt, int secondInt, int answer);
	// Uses a recusive algorithim to loop until the user gets the answer correct.

	void repeat();
	// The user decides if he wants to repeat the process, or go back to the main menu
}