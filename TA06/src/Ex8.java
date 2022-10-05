
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		int numbers[] = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = fill();
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			
			show(i, numbers);
			
		}

	}
	
	public static int fill() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int number = Integer.parseInt(sc.nextLine());
		return number;
		
	}
	
	public static void show(int i, int numbers[]) {
		
		System.out.println("Index: " + i + ", número: " + numbers[i]);
		
	}

}
