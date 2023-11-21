
import java.util.Scanner;
public class RelacaoPares {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[],i,p=0;
		final int TAM = 10;
		
		a = new int [TAM];
		
		System.out.println("Entre com os valores de A");
		
		for (i=0;i<TAM;i++) {
			
			System.out.println("\nEntre com o "+(i+1)+"° valor");
			
			a[i] = in.nextInt();
			
			while(p<a[i]) {
				
				System.out.print("\nSão pares relacionados até o número "+a[i]+" os seguintes: ");
				
				System.out.print(p+" ");
				
				p = p+2;
			}
		}
		in.close();
	}
}