import java.util.Scanner;
public class Interseccao {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[],c[],i,d,e;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [20];
		
		System.out.println("Entre com os valores de A");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"° valor");
			a[i] = in.nextInt();
		}
		
		System.out.println("Entre com os valores de B");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"° valor");
			b[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			c[i]=a[i];
			c[i+10] = b[i];
		}
		for(i=0;i<20;i++) {
			System.out.println("Valores do vetor C");
			System.out.println(c[i]);
		}
		in.close();
	}
}
