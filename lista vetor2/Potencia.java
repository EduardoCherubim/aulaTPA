
import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[],i,p,r;
		 
		final int TAM = 11;
		
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.print("Na posi��o "+i+ " a pot�ncia do n�mero 2 por "+i+" � ");
			r=2;
			p=2;
			while (r<=i) {
				p = p*2;
				r++;
				a[i]=p;
			}
			System.out.print(a[i]+"\n");
		}
		in.close();
	}
}