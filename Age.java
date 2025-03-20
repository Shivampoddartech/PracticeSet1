package Scanner;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age: ");
		int age = sc.nextInt();

		if (age == 0) {
			System.out.println("New Born Baby");
		}
		else if (age >= 70) {
			System.out.println("You are Super Legend");
		} 
		else if (age >= 50) {
			System.out.println("You are Legend");
		}
		else if (age >= 30) {
			System.out.println("You are a Man");
		}
		else if (age >= 18) {
			System.out.println("You are an Adult");
		}
		else if (age >= 10) {
			System.out.println("You are a Baby Boy");
		}
		else {
			System.out.println("You are a Child");
		}

		sc.close();
	}
}
