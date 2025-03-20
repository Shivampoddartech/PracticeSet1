package Scanner;
import java.util.Random;
public class RandomNumbe {
public static void main(String[] args) {
	
	Random randum = new Random();
	int number;
	
	int number1;
	int number2;
	int number3;
	
	
	number1 = randum.nextInt(1 , 10);
	number2 = randum.nextInt(1, 10);
	number3 = randum.nextInt(1, 10);
	
	System.out.println(number1);
	System.out.println(number2);
	System.out.println(number3);
}
}
