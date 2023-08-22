
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		
		System.out.println("Entre com o ano de nascimento:");
		anoNasc = in.nextInt();
		System.out.println("Entre com o ano atual:");
		anoAtual = in.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println("SUa idade é " +idade);
		if(idade<18) {
			System.out.println("Menor de idade");
		}else {
			System.out.println("Maior de idade");
		}
	}

}
