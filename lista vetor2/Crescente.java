import java.util.Scanner;
public class Crescente{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[],c[],i,j,p;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for ( i=0;i<TAM;i++){
			System.out.println("Escreva um número");
			a[i] = in.nextInt();
		}
		for ( i=0;i<TAM;i++){
			for ( j=0;j<TAM;j++){
				if (a[i]>a[j]){
					p = a[i];
					a[i] = a[j];
					a[j] = p;
				}
			}
		}
		System.out.print("Em ordem crescente: ");
		for (i=9;i>0;i--){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEm ordem decrescente: ");
		for ( i=0;i<TAM;i++){
			System.out.print(a[i]+" ");
		}
	}
}
