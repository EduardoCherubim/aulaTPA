package lista04;

import java.util.Scanner;
public class números {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n ;
		
		System.out.println("escreva o número");
		n = in.nextInt();
		if (n==0) {
			System.out.println("Neutro");
		}else if (n<0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}

		
	}

}
