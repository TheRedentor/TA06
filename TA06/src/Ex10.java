
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		int array[];
		int number = 0;
		boolean prime = false;
		int biggest = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del array:");
		String arrayLength = sc.nextLine();
		
		array = new int[Integer.parseInt(arrayLength)];
		
		for (int i = 0; i < array.length; i++) {
			
			while (prime == false) {
				
				number = randomNumber(1, 1000);
				prime = isPrime(number);
				
			}
			
			array[i] = number;
			prime = false;
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Posición: " + (i+1) + ", valor: " + array[i]);
			
			if (array[i] > biggest) {
				
				biggest = array[i];
				
			}
			
		}
		
		System.out.println("El número más grande es " + biggest);

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
	
	public static int randomNumber(int val1, int val2) {
		
		return (int)(Math.random()*(val2-val1+1)+val1);
		
	}
	
}
