
import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		long a[],b[],f=0;
		int g;
		final int TAM = 15;
		
		a = new long [TAM];
		b = new long [TAM];
		
		for (int i=0;i<TAM;i++){
			System.out.println("\nSelecione um numero para fatorial");
			a[i] = in.nextInt();
			f = a[i];
			for (g=1;g<a[i];g++){
				f = f*g;
			}
			b[i]= f;
			
		}
		System.out.print("\nOs números do vetor A são: ");
		for(int i=0;i<TAM;i++){
		System.out.print(a[i]+" ");
		}
		System.out.print("\nJá o fatorial do vetor A no vetor B ");
		for (int i=0;i<TAM;i++){
			System.out.print(b[i]+" ");
		}
	}
}