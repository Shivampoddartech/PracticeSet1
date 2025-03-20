package Scanner;
import java.util.Scanner;
public class PersonalInformationGpt {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Your Name:");
	        String name = sc.nextLine();

	        System.out.println("Enter Your Age:");
	        int age = sc.nextInt();
	        sc.nextLine();  // Consume newline

	        System.out.println("Enter Date of Birth (DD-MM-YYYY):");
	        String dob = sc.nextLine();  // Keeping as String for simplicity

	        System.out.println("Your Highest Qualification:");
	        String qualification = sc.nextLine();

	        System.out.println("Enter Your Marks:");
	        int marks = sc.nextInt();
	        sc.nextLine();  // Consume newline

	        System.out.println("Any Previous Experience? (Yes/No):");
	        String experience = sc.nextLine();

	        System.out.println("How Many Years Of Work Experience:");
	        double workExperience = sc.nextDouble();

	        System.out.println("Your Current CTC:");
	        double currentCTC = sc.nextDouble();

	        System.out.println("Your Expected CTC:");
	        double expectedCTC = sc.nextDouble();
	        sc.nextLine();  // Consume newline

	        System.out.println("Are You Immediately Available (Yes/No):");
	        String immediatelyAvailable = sc.nextLine();

	        // Displaying Information
	        System.out.println("\n----- Personal Information -----");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Date of Birth: " + dob);
	        System.out.println("Highest Qualification: " + qualification);
	        System.out.println("Marks: " + marks);
	        System.out.println("Previous Experience: " + experience);
	        System.out.println("Work Experience: " + workExperience + " years");
	        System.out.println("Current CTC: " + currentCTC);
	        System.out.println("Expected CTC: " + expectedCTC);
	        System.out.println("Immediately Available: " + immediatelyAvailable);
	        
	        sc.close();  // Close scanner to prevent resource leak
	    }
	}


