package Scanner;

import java.util.*;

public class IfElseProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Age");
		int age = sc.nextInt();

		if (age == 0) {
			System.out.println("New Born Baby");
		}
		else if (age >= 70) {
			System.out.println(" you are Super Legend");
		}
		else if (age >= 50) {
			System.out.println(" you are Legend");
		}

		else if (age >= 30) {
			System.out.println(" you are Man");
		}
		else if (age >= 30) {
			System.out.println(" you are Man");
		}
		
		else if (age >= 18) {
			System.out.println(" you are adult ");
		}
		
		else if (age >= 10) {
			System.out.println("Baby boy");
		}

		else {
			System.out.println("something wrong plz check one more time");

		}

		sc.close();
	}
}
