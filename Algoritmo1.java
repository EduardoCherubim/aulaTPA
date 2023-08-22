
import java.util.Scanner;
public class Algoritmo1 {
	
	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		double base, h, area;
		
		System.out.println("Entre com a base do Triangulo: ");
		base = in.nextDouble();
		System.out.println("Entre com a altura do triangulo: ");
		h= in.nextDouble();
		
		area=((base*h)/2);
		
		System.out.println("o resultado da area do triangulo é " +area);
		
		in.close();
	
	}
}

