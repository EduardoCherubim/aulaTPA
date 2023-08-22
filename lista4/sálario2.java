package lista04;

import java.util.Scanner;
public class sálario2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salarioUser, salarioMinimo, r;
		
		System.out.println("Escreva o sálario do úsuario:");
		salarioUser = in.nextDouble();
		System.out.println("Escreva o sálario mínimo:");
		salarioMinimo = in.nextDouble();
		r = salarioUser/salarioMinimo;
		System.out.println("O resultado é ");
		if(r<1) {
			System.out.println("Abaixo");
		}else{
			System.out.println("Acima");
		}
		

	}

}
