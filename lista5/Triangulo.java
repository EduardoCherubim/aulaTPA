package lista5;

import java.util.Scanner;
public abstract class Triangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c; 
		
		System.out.println("Entre com o valor de A");
		a = in.nextInt();
		System.out.println("Entre com o valor de B");
		b = in.nextInt();
		System.out.println("Entre com o valor de C");
		c = in.nextInt();
		
		if(a>b+c || b>a+c || c>a+b ) {
			System.out.println("N�o � tri�ngulo");
		}else if(a==b && b==c && a==c) {
			System.out.println("Equil�tero");
		}else if (a!=b && b!=c && a!=c) {
			System.out.println("Escaleno");
		}else {
			System.out.println("Is�sceles");
		}
		in.close();

	}

}
