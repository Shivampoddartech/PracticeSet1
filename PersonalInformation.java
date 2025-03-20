package Scanner;

import java.util.*;

public class PersonalInformation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name");
		String name = sc.next();

		System.out.println("Enter Your Age");
		int age = sc.nextInt();

		System.out.println("Date Of Birth");
		int DOB = sc.nextInt();

		System.out.println("Your Higest Qualification");
		String Qualification = sc.next();

		System.out.println("Enter yours Marks");
		int marks = sc.nextInt();

		System.out.println("Any Previos Experience");
		String Experience = sc.next();

		System.out.println("How Many Years Of Work Experience");
		double  WorkExperience = sc.nextDouble();

		System.out.println("Your Current CTC");
		int CurrentCTC = sc.nextInt();

		System.out.println("Your exceptation In CTC");
		int Yourexceptation = sc.nextInt();

		System.out.println(" Are You Immeditely Avaiable  With in 15 Days");
		String ImmeditelyAvaiable = sc.next();

		System.out.println("Thankyou For Showing Intrest ...");
		String ThankyouMassage = sc.next();

		System.out.println( "name" +name + "age "+age +"Dob "+DOB + "Higest Qualification "+Qualification  + "Marks" + marks + "workExperience "+WorkExperience+ "immeditely Avaiable" + ImmeditelyAvaiable + "Thankyou Massage" +ThankyouMassage );
//		System.out.println("Enter Your Name" + name);
//		System.out.println("Enter Your Age" + age);
//		System.out.println("Date Of Birth" + DOB);
//		System.out.println("Your Higest Qualification" + Qualification);
//		System.out.println("Enter yours Marks" + marks);
//		System.out.println("Any Previos Experience (Yes/ No)" + Experience);
//		System.out.println("How Many Years Of Work Experience" + WorkExperience);
//		System.out.println("Your Current CTC" + CurrentCTC);
//		System.out.println("Your exceptation In CTC" + Yourexceptation);
//		System.out.println(" Are You Immeditely Avaiable  With in 15 Days" + ImmeditelyAvaiable);
//		System.out.println("Thankyou For Showing Intrest ..." + ThankyouMassage);

	}
}
