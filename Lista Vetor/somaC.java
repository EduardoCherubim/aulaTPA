import java.util.Scanner;
public class somaC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,a[],b[],c[];
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		System.out.println("entre com os valosres de A");
		for(i=0; i<10; i= i +1) {
			System.out.println("Entre com o "+(i+1)+"o numero");
			a[i] = in.nextInt();
		}
		
		System.out.println("entre com os valosres de B");
		for(i=0; i<10; i= i +1) {
			System.out.println("Entre com o "+(i+1)+"o numero");
			b[i] = in.nextInt();
		}
		
		for(i=0; i<10; i= i +1) {
			c[i] = a[i]+b[i];
		}
		
		System.out.print("a[] = [");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		System.out.print("\nb[] = [");
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		
		System.out.print("\nc[] = [");
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		in.close();
	}

}
