
import java.util.Scanner;

public class Algoritmo2 {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Entre com o seu ano de nascimento: ");
		anoNasc = in.nextInt();
		System.out.println("Entre com o ano atual: ");
		anoAtual = in.nextInt();
		
		idade=anoAtual-anoNasc;
		System.out.println("A sua idade é " +idade);
		
		in.close();
	}

}
