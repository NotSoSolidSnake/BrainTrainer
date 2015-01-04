import java.util.*;
public class Testing {
	
	public static void main(String[] args) {

		Random rand = new Random();
		for(int x = 0; x < 10; x++) {

			System.out.println();

			int num1 = rand.nextInt (900) + 100;
			int num2 = rand.nextInt (900) + 100;
			int num3 = rand.nextInt (9000) + 1000;

			System.out.printf("%s-%s-%s", num1,num2,num3);
	}
			System.out.println();
}
}