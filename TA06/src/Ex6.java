
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número positivo:");
		String number = sc.nextLine();
		while (Integer.parseInt(number) < 0) {
			System.out.println("Introduce un número positivo:");
			number = sc.nextLine();
		}
		
		int digits = numberOfDigits(number);
		System.out.println("Número de dígitos: " + digits);

	}
	
	public static int numberOfDigits(String number) {

		int digits = 0;
		
		for (int i = 0; i < number.length(); i++) {
			
			digits++;
			
		}
		
		return digits;
		
	}
	
}
