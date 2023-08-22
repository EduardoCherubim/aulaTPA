package lista7;

import java.util.Scanner;
public class aluno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		
		System.out.println("Entre com a idade da criança");
		i = in.nextInt();
		
		switch(i) {
		case 6:
			System.out.println("Classificação é Dente de Leite");
			break;
		case 7:
			System.out.println("Classificação é Júnior");
			break;
		case 8:
			System.out.println("Classificação é Júnior max");
			break;
		case 9:
			System.out.println("Classificação é Júnior Master");
			break;
		case 10:
			System.out.println("Classificação é Master");
			break;
		default:
			System.out.println("Idade Invalida");
			break;
		}
		
		
		in.close();
	}

}
