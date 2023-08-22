package lista5;

import java.util.Scanner;
public class Bhaskara {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a,b ,c,d,x1,x2;
		
		System.out.println("Entre com o vaor e A:");
		a = in.nextDouble();
		System.out.println("Entre com o vaor e B:");
		b = in.nextDouble();
		System.out.println("Entre com o vaor e C:");
		c = in.nextDouble();
		d = (b*b)-4 *a*c;
		if(d<0) {
			System.out.println("Não tem raizes");
		}else if(d == 0) {
			x1 = b + Math.sqrt(d)/2*a;
			System.out.println("O resultado da raiz é "+x1);
		}else if (d>0) {
			x1 = b + Math.sqrt(d)/2*a;
			x2 = b - Math.sqrt(d)/2*a;
			System.out.println("O resultado das raizes são "+x1+"e "+x2);
		}
		in.close();
		
		

	}

}
