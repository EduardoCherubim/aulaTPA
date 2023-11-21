import java.util.Scanner;
public class Quadrado {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int i,a[],b[];
		a = new int [TAM];
		b = new int [TAM];
		
		System.out.println("Entre com os valores de A");
		
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o numero");
			a[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			b[i] = a[i]*a[i];
		}
		
		System.out.print("a[] = [");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		System.out.print("b[] =[ ");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		in.close();
	}

}
