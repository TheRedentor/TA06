
import java.util.Scanner;
import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		
		int array1[];
		int array2[];
		int multiplied[];
		int number = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de los array:");
		String arrayLength = sc.nextLine();
		
		array1 = new int[Integer.parseInt(arrayLength)];
		array2 = new int[Integer.parseInt(arrayLength)];
		
		for (int i = 0; i < array1.length; i++) {
			
			array1[i] = randomNumber(0, 9);
			array2 = Arrays.copyOf(array1, array1.length);
			
		}
		
		for (int i = 0; i < array2.length; i++) {
			
			array2[i] = randomNumber(0, 9);
			
		}
		
		multiplied = multiplyArray(array1, array2);
		
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		System.out.println("Array multiplicado: " + Arrays.toString(multiplied));
		
	}
	
	public static int randomNumber(int val1, int val2) {
		
		return (int)(Math.random()*(val2-val1+1)+val1);
		
	}
	
	public static int[] multiplyArray(int array1[], int array2[]) {
		
		int multiplied[] = Arrays.copyOf(array2, array2.length);
		
		for (int i = 0; i < array1.length; i++) {
			
			multiplied[i] = array1[i] * array2[i];
			
		}
		
		return multiplied;
		
	}

}
