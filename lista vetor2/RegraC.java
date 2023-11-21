import java.util.Scanner;
public class RegraC {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], c[];
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (int i=0;i<TAM;i++){
			System.out.println("Insira um valor do vetor A");
			a[i] = in.nextInt();
		}
		
		for (int i=0;i<TAM;i++){
			System.out.println("Insira um valor do vetor B");
			b[i] = in.nextInt();
		}
		
		for (int i=0;i<TAM;i++){
			if (a[i]>b[i]){
				c[i] = 1;
			} else if (a[i]==b[i]){
				c[i] = 0;
			} else {
				c[i] = -1;
			}
		}
		System.out.println("Os valores de C são: ");
		for (int i=0;i<TAM;i++){
			System.out.println(c[i]+" ");
		}
		in.close();
	}
}
