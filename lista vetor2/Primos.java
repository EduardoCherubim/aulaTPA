import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[],i,r,b,n;
		double div;
		final int TAM = 10;
		a = new int [TAM];
		
		//vai entrar com os valores//
		System.out.println("Entre com os valores de A");
		for(i=0;i<TAM;i++) {
			
			//as variaveis r e n vão servir para identificar se um numero é primo ou não//
			r = 0;
			n = 1;
			System.out.println("Entre com o "+(i+1)+"° valor");
			a[i] = in.nextInt();
			
			//b vai ser a variavel que vai identificar se o resto de uma divisão é igual a zero//
			b = a[i];
			
			// o laço vai servir para verificar se o número é primo//
			while (n<=b) {
				div = b%n;
				
				//se o resto da divisão for igual a zero as variaveis r e n vão receber 1//
				if(div==0) {
					r++;
					n++;
					
					//se o resto for diferente só n vai receber 1// 
				}else {
					n++;
				}
			}
			if(r<1) {
				System.out.println("Não é primo");
			}else if (r==2) {
				System.out.println("É primo");
			}else {
				System.out.println("Não é primo");
			}
		}
		in.close();
	}

}
