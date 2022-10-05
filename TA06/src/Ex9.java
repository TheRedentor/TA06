
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		int number = 0;
		int result = 0;
		int array[];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del array:");
		String arrayLength = sc.nextLine();
		
		array = new int[Integer.parseInt(arrayLength)];
		
		for (int i = 0; i < array.length; i++) {
			
			number = randomNumber(0, 9);
			array[i] = number;
		}
		
		show(array);
		
	}
	
	public static int randomNumber(int val1, int val2) {
		
		return (int)(Math.random()*(val2-val1+1)+val1);
		
	}
	
	public static void show(int array[]) {
		
		int result = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Posición: " + (i+1) + ", valor: " + array[i]);
			result += array[i];
			
		}
		
		System.out.println("Suma total: " + result);
		
	}

}
