import java.util.Scanner;
public class Diferenca{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[],c[],i,j;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [20];
		
		//ler os valores
		for (i=0;i<TAM;i++){
			System.out.println("Escreva os números do vetor A");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<TAM;i++){
			System.out.println("\nEscreva os números do vetor B");
			b[i] = in.nextInt();
			for (int g=0; g<TAM;g++){
				for (j=10; j<20;j++){
					//vai verificar quais valores não tem em a e tem em b, então c vai receber esses valores 
					if (b[i]!=a[g]){
						c[j] = b[i];
					}
				}
			}
		}
		for (i=0;i<TAM;i++){
			for (int g=0; g<TAM;g++){
				//vai verificar quais valores não tem em b e tem em a, então c vai receber esses valores 
				if (a[i]!=b[g]){
					c[i] = a[i];
				}
			}
		}
		System.out.print("Os valores do vetor C é: ");
		for (i=0;i<20;i++){
				System.out.print(c[i]+" ");
		}
		in.close();
	}
}

