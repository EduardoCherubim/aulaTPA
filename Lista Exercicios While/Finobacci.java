
import java.util.Scanner;
public class Finobacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i =0,r=1,c,n=0;
		
		System.out.println("Entre com o número de casas da série de Fibonacci:");
		c = in.nextInt();
		while(i<=c) {
			r = r + n;
			n = r - n;
			System.out.println(r);
			i++;
		}
		in.close();
	}

}
