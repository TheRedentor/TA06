
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros:");
		String euros = sc.nextLine();
		
		System.out.println("Introduce la moneda a la que cambiar:");
		String currency = sc.nextLine();
		
		convert(Double.parseDouble(euros), currency);

	}
	
	public static void convert(double euros, String currency) {
		
		if (currency.toLowerCase().equals("libras")) {
			System.out.println((euros * 0.86) + " libras");
		}
		else if (currency.toLowerCase().equals("dolares")) {
			System.out.println((euros * 1.28611) + " dólares");
		}
		else if (currency.toLowerCase().equals("yenes")) {
			System.out.println((euros * 129.852) + " yenes");
		}
		
	}

}
