import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],i,m=0,r;
		final int TAM = 5;
		a = new int [TAM];
		
		System.out.println("Entre com os valores de A");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"° valor");
			a[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			m=0;
			while(m<=10) {
				r = a[i] * m;
				System.out.println(a[i]+"X"+m+"="+r);
				m++;
			}
			
		}
		in.close();
	}

}
