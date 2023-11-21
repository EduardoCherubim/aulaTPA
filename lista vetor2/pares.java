import java.util.Scanner;
public class pares {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[];
		final int TAM = 20;
		a = new int [TAM];
		b = new int [TAM];
		
		for(int i = 0; i<TAM; i=i+1) {
			System.out.println("Entre com o "+(i+1)+"° numero");
			a[i] = in.nextInt();
		}System.out.print("Pares:");
		for(int i=0; i<TAM;i++) {
			if(a[i] % 2 == 0) {
				b[i] = a[i];
				System.out.print(b[i]+"; ");
			}
		}System.out.print("\nImpares:");
		for(int i=0;i<TAM;i++) {
			if(a[i] % 2 != 0) {
				b[i] = a[i];
				System.out.print(b[i]+"; ");
			}
		}

		in.close();
	}

}
