package lista04;

import java.util.Scanner;
public class s�lario2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salarioUser, salarioMinimo, r;
		
		System.out.println("Escreva o s�lario do �suario:");
		salarioUser = in.nextDouble();
		System.out.println("Escreva o s�lario m�nimo:");
		salarioMinimo = in.nextDouble();
		r = salarioUser/salarioMinimo;
		System.out.println("O resultado � ");
		if(r<1) {
			System.out.println("Abaixo");
		}else{
			System.out.println("Acima");
		}
		

	}

}
