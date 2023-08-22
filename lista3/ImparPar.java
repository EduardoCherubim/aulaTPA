
import java.util.Scanner;
public class ImparPar {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int  n, r;
		
		System.out.println("Escreva o número:");
		n = in.nextInt();
		r = n % 2;
		System.out.println("O número é ");
		if(r == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

}
