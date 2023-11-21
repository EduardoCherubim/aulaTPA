import java.util.Random;
public class Soma {

	public static void main(String[] args) {
		Random in = new Random();
		int v[][], i, j, soma=0, LINHA=3, COL=4,col=0;
		v = new int [LINHA][COL];
		
		for(i=0;i<LINHA;i++) {
			for(j=0;j<COL;j++) {
				v[i][j] = in.nextInt()%100;
				if(j==LINHA) {
					v[i][j] = soma;
					soma=0;
				}else {
					soma = soma+v[i][j];
				}
			}
		}
		
		for(i=0;i<LINHA;i++) {
			for(j=0;j<COL;j++) {
				if(col==LINHA) {
					System.out.print("soma = "+v[i][j]+" \n");
					col=0;
				}else {
				System.out.print(v[i][j]+" ");
				col++;
				}
			}
		}
		

	}
}
