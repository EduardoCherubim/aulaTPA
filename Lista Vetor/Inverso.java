import java.util.Scanner;
public class Inverso {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,a[],b[],ii = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		System.out.println("entre com os valosres de A");
		for(i=0; i<TAM; i= i +1) {
			System.out.println("Entre com o "+(i+1)+"o numero");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; ii--) {
			b[ii] = a[i];
			i++;
		}
		
		System.out.print("a[] = [");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		System.out.print("\nb[] = [");
		for(i=0;i<TAM;i++) {
			System.out.print(b[ii]+" ");
		}
		System.out.print("]");
		in.close();
	}

}
