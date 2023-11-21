import java.util.Scanner;
public class Dobro {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i,j,d = 0,n=2,col = 0;
		int v[][] = new int [4][4];
		
		v[0][0] = n;
		for(i=0;i<4;i++) {
			for (j=1;j<4;j++) {
				n = n * 2;
				v[i][j] = n;
			}
		}
		
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(v[i][j]+" ");
				col++;
			}
			if(col>=4) {
				System.out.print("\n");
				col=0;
			}else {}
		}
		
	}

}
