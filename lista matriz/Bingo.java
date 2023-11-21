
import java.util.Scanner;
import java.util.Random;
public class Bingo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		int v[][] = new int [4] [4];
		int i,j,n,d=0;
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				v[i][j] = ran.nextInt(76)%50;
			}
		}
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print("[ "+v[i][j]+"] ");
			}
			System.out.println("\n");
		}
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.println("Entre com o número cantado:");
				n = in.nextInt();
				
				if(v[i][j] ==n) {
					System.out.println("Possui número");
					d++;
				}else {
					System.out.println("Não possui número");
				}
			}
		}
		if(d == 16) {
			System.out.println("Bingo");
			System.out.println("Numero de acertos "+d);
		}else {
			System.out.println("Cartela incompleta");
			System.out.println("Numero de acertos "+d);
		}
			
	}

}
