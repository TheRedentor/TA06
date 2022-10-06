
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		String number = sc.nextLine();
		
		int result = factorial(Integer.parseInt(number));
		System.out.println("El factorial de " + number + " es " + result);
		
	}
	
	public static int factorial(int number) {
		
		int result = number;
		
		for (int i = number-1; i > 0; i--) { //Ejemplo factorial de 5: 5 * 4 * 3 * 2 * 1
			result = result * i;
		}
		
		return result;
		
	}

}
