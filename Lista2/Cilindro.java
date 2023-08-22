
import java.util.Scanner;
public class Cilindro {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		double h,r,PI,v;
		
		System.out.println("Entre com a altura do cilindro: ");
		h = in.nextDouble();
		System.out.println("Entre com o comprimento do cilindro: ");
		r = in.nextDouble();
		PI = 3.14;
				
		v = PI*(r*r)*h;	
		System.out.println("O resultado é " +v);
		
		in.close();
	}
}
