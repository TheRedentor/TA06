
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		double area = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre de la figura:");
		
		String figura = sc.nextLine();
		
		if (figura.equals("Circulo")) {
			area = AreaCirculo();
		}
		else if (figura.equals("Triangulo")) {
			area = AreaTriangulo();
		}
		if (figura.equals("Cuadrado")) {
			area = AreaCuadrado();
		}
		
		System.out.println("El área del " + figura + " es " + area);

	}
	
	public static double AreaCirculo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio de la figura:");
		double radio = Double.parseDouble(sc.nextLine());
		return Math.pow(radio, 2) * Math.PI;
		
	}
	
	public static double AreaTriangulo() {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base de la figura:");
		double base = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la altura de la figura:");
		double altura = Double.parseDouble(sc.nextLine());
		return (base * altura) / 2;
		
	}
	
	public static double AreaCuadrado() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un lado de la figura:");
		double lado1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el otro lado de la figura:");
		double lado2 = Double.parseDouble(sc.nextLine());
		return lado1 * lado2;
		
	}

}
