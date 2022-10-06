
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
		
		array = new int[Integer.parseInt(arrayLength)]; //crear array con la longitud indicada
		
		for (int i = 0; i < array.length; i++) { //loop de 0 a la longitud indicada
			
			while (prime == false) { //mientras no sea primo, sigo buscando un número primo
				
				number = randomNumber(1, 1000); //crea un valor aleatorio entre 1 i 1000
				prime = isPrime(number); //comprueba si es un numero primo y devuelve true o false
				
			}
			
			array[i] = number; //añade el número primo al array
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
			if (number % i == 0) { //si el número es divisible entre otro, no es primo
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
