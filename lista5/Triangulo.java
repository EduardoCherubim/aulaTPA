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
			System.out.println("Não é triângulo");
		}else if(a==b && b==c && a==c) {
			System.out.println("Equilátero");
		}else if (a!=b && b!=c && a!=c) {
			System.out.println("Escaleno");
		}else {
			System.out.println("Isósceles");
		}
		in.close();

	}

}
