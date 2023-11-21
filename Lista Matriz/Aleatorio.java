import java.util.Random;
public class Aleatorio {
	public static void main(String args[]) {
		final int TAM=3;
		int v[][], i, j, col=0, menor, maior, posilinha, posicoluna;
		v = new int [TAM][TAM];
		Random in = new Random();
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				v[i][j] = in.nextInt()%50;
			}
		}
		
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				System.out.print(v[i][j]+" ");
				col++;
			}
			if(col>=TAM) {
				System.out.print("\n");
				col=0;
			}else {}
		}
		
		System.out.print("\n");
		
		menor = v[0][0];
		posilinha = 0;
		posicoluna = 0;
		maior = v[0][0];
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(v[i][j]<menor) {
					menor = v[i][j];
					posilinha = i;
					posicoluna = j;
				}else {}
			}
		}
		
		System.out.println(menor+" e o menor numero da matriz e esta na posição "+posilinha+ ","+posicoluna+"\n");
		
		maior = v[0][0];
		posilinha = 0;
		posicoluna = 0;
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(v[i][j]>maior) {
					maior = v[i][j];
					posilinha = i;
					posicoluna = j;
				}
			}
		}
		
		System.out.println(maior+" e o maior numero da matriz e esta na posição "+posilinha+ ","+posicoluna+"\n");
}
}