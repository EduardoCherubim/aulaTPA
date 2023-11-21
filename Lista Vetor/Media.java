import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,a[],r = 0,m;
		a = new int [TAM];

		System.out.println("entre com os valosres de A");
		for(i=0; i<10; i= i +1) {
			System.out.println("Entre com o "+(i+1)+"o numero");
			a[i] = in.nextInt();
		}
		for(i=0; i<10; i= i +1) {
			r = r+ a[i];
		}
		m = r/10;
		
		System.out.print("a[] = [");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		System.out.println("\nMedia "+m);
		in.close();
	}

}
