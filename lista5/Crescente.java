package lista5;

import java.util.Scanner;
public class Crescente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Entre com o valor de A:");
		a = in.nextInt();
		System.out.println("Entre com o valor de B:");
		b = in.nextInt();
		System.out.println("Entre com o valor de C:");
		c = in.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("A ordem � "+a+", "+b+", "+c);
		}else if(a<=c && c<=b) {
			System.out.println("A ordem � "+a+", "+c+", "+b);
		}else if(b<=a && a<=c){
			System.out.println("A ordem � "+b+", "+a+", "+c);
		}else if(b<=c && c<=a){
			System.out.println("A ordem � "+b+", "+c+", "+a);
		}else if(c<=a && a<=b){
			System.out.println("A ordem � "+c+", "+a+", "+b);
		}else {
			System.out.println("A ordem � "+c+", "+b+", "+a);
		}
		in.close();
			
		

	}

}
