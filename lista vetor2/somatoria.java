import java.util.Scanner;
public class somatoria {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[],i,j,r;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		for(j=0;j<TAM;j++) {
			System.out.println("Entre com o "+(j+1)+"° numero");
			a[j] = in.nextInt();
		}
		for(i=0;i<TAM;i++) {
			j=1;
			while(j<TAM) {
			r = a[j-1]+a[j];
			b[i] = r;
			j++;
			System.out.println(r);
			}
		}
		System.out.println("\nOs valores de B são:");
		for(i=0;i<TAM;i++) {
			System.out.println(b[i]);
		}
		in.close();
	}
}
