package lista7;

import java.util.Scanner;
public class placa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p;
		
		System.out.println("Entre com o último número da placa");
		p = in.nextInt();
		
		switch(p) {
		case 1:
		case 2:
			System.out.println("Não poderá rodar Segunda");
			break;
		case 3:
		case 4:
			System.out.println("Não poderá rodar Terça");
			break;
		case 5:
		case 6:
			System.out.println("Não poderá rodar Quarta");
			break;
		case 7:
		case 8:
			System.out.println("Não poderá rodar Quinta");
			break;
		case 9:
		case 0:
			System.out.println("Não poderá rodar Sexta");
			break;
		default:
			System.out.println("Número de placa invalido");
			
			
		}
		
		in.close();
	}

}
