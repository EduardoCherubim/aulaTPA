package lista7;

import java.util.Scanner;
public class aluno {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		
		System.out.println("Entre com a idade da crian�a");
		i = in.nextInt();
		
		switch(i) {
		case 6:
			System.out.println("Classifica��o � Dente de Leite");
			break;
		case 7:
			System.out.println("Classifica��o � J�nior");
			break;
		case 8:
			System.out.println("Classifica��o � J�nior max");
			break;
		case 9:
			System.out.println("Classifica��o � J�nior Master");
			break;
		case 10:
			System.out.println("Classifica��o � Master");
			break;
		default:
			System.out.println("Idade Invalida");
			break;
		}
		
		
		in.close();
	}

}
