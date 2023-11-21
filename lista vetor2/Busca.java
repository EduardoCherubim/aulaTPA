
import java.util.Scanner;
public class Busca {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], proc,i,sn,h=0;
		final int TAM = 10;
		
		a = new int[TAM];
		
		//ler o valor
		for (i=0;i<TAM;i++){
			System.out.println("Digite um número para o vetor");
			a[i] = in.nextInt();
		}
		
		//ler o número que vai ser buscado
		do {
			System.out.println("Diga o número que deseja procurar.");
			proc = in.nextInt();
			
			//vai procurar o valor no vetor
			//procurando por cada posição
			for(i=0;i<TAM;i++){
				//se o valor existir ele segue
				if (proc==a[i]){
					System.out.println("O número existe no vetor");
				} 
			}
			
			//se não termina
			if (h==0){
				System.out.println("O número não existe no vetor");
			}
			
			//se quiser continuar sn vai receber 1, assim entrando no if else, dentro do if ele vai receber mais um no valor dele
			//se não quiser continuar sn vai receber 2, assim zerando o valor e encerrando o buscador
			System.out.println("Você quer continuar? 1 Para sim, 2 para não.");
			sn = in.nextInt();
			if (sn==1){
				sn++;
			} else if (sn==2) {
				sn=0;
			} else {
				System.out.println("Número Inválido, reiniciando o programa");
				sn++;
			}
			h=0;
		} while(sn>0);
		System.out.println("Programa encerrado");
		in.close();
	}
}