package lista6;

import java.util.Scanner;
public class Ingresso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double i, d;
		String e;
		
		System.out.println("Incira o valor do ingre�o");
		i = ler.nextDouble();
		System.out.println("Voc� � estudante?");
		e = ler.next();
		if ( e == "Sim" ) {
			d = i * 0.5;
			System.out.println("Seu desconto � de "+d);
		
		}
	
		
		
		
	}
	
}
