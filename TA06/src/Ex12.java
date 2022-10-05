import java.util.Scanner;
import java.util.Arrays;

public class Ex12 {

	public static void main(String[] args) {
		
		String lastDigit = "-1";
		int array[];
		int lastDigitArray[];
		int savedArray[];
		int trueSavedArray[];
		int j = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud del array:");
		String arrayLength = sc.nextLine();
		
		array = new int[Integer.parseInt(arrayLength)];
		lastDigitArray = new int[Integer.parseInt(arrayLength)];
		savedArray = new int[Integer.parseInt(arrayLength)];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = randomNumber(1, 300);
			
		}
		
		System.out.println(Arrays.toString(array));
		
		while(Integer.parseInt(lastDigit) < 0 || Integer.parseInt(lastDigit) > 9) {
			
			System.out.println("Introduce el dígito por el que deben acabar los números a mostrar:");
			lastDigit = sc.nextLine();
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]%10 == Integer.parseInt(lastDigit)) {
				
				savedArray[j] = array[i];
				j++;
				
			}
			
		}
		
		trueSavedArray = Arrays.copyOf(savedArray, j);
		
		System.out.println("Números coincidentes: ");
		
		for (int i = 0; i < trueSavedArray.length; i++) {
			
			System.out.println(trueSavedArray[i]);
			
		}

	}
	
	public static int randomNumber(int val1, int val2) {
		
		return (int)(Math.random()*(val2-val1+1)+val1);
		
	}

}
