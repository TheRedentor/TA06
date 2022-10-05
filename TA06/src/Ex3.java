
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		String number = sc.nextLine();
		
		if (isPrime(Integer.parseInt(number))){
			System.out.println("El número " + number + " SI es primo");
		}
		else {
			System.out.println("El número " + number + " NO es primo");
		}

	}
	
	public static boolean isPrime(int number) {
		
		boolean prime = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}
		
		return prime;
		
	}

}
