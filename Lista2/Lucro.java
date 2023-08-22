
import java.util.Scanner;
public class Lucro {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p,l,v;
		
		System.out.println("Entre com o preço do produto: ");
		p = in.nextDouble();
		System.out.println("Entre com a porcentagem de lucro: ");
		l = in.nextDouble();
		
		v = (p*l)/100+p;
		
		System.out.println("O valor de seu lucro é " +v);
		
		in.close();
	}
	

}
