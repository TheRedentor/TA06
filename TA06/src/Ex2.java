
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de números que desees:");
		String numbers = sc.nextLine();
		
		System.out.println("Introduce el número mas bajo:");
		String minNumber = sc.nextLine();
		
		System.out.println("Introduce el número mas alto:");
		String maxNumber = sc.nextLine();
		
		System.out.println("Números aleatorios:");
		
		for (int i = 0; i < Integer.parseInt(numbers); i++) {
			int number = randomNumber(Integer.parseInt(minNumber), Integer.parseInt(maxNumber));
			System.out.println(number);
		}
		
	}
	
	public static int randomNumber(int val1, int val2) {
		
		return (int)(Math.random()*(val2-val1+1)+val1);
		
	}

}
