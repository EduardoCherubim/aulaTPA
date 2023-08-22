package lista04;

import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double f, c;
		
		System.out.println("Escreva a temperatura em farenheit:");
		f = in.nextDouble();
		c = (f-32)/1.8;
		System.out.println("a temperatura em Celsius é " +c);
		
		if(c>=22) {
			System.out.println("Calor");
		}else if(c>15) {
			System.out.println("Ameno");
		}else {
			System.out.println("Frio");
		}
		

	}

}
