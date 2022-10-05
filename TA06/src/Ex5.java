
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		String number = sc.nextLine();
		
		String binaryNumber = convertToBinary(Integer.parseInt(number));
		System.out.println(binaryNumber);

	}
	
	public static String convertToBinary(int number) {
		
		int binary[] = new int[40];
		String strBinary = "";
	    int index = 0;
	    
	    while (number > 0) {
	    	
	        binary[index++] = number % 2;
	        number = number / 2;
	        
	    }
		
	    for (int i = index - 1; i >= 0; i--) {
	    	
	    	strBinary += binary[i];
	    	
	    }
	    
		return strBinary;
		
	}

}
