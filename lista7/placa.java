package lista7;

import java.util.Scanner;
public class placa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p;
		
		System.out.println("Entre com o �ltimo n�mero da placa");
		p = in.nextInt();
		
		switch(p) {
		case 1:
		case 2:
			System.out.println("N�o poder� rodar Segunda");
			break;
		case 3:
		case 4:
			System.out.println("N�o poder� rodar Ter�a");
			break;
		case 5:
		case 6:
			System.out.println("N�o poder� rodar Quarta");
			break;
		case 7:
		case 8:
			System.out.println("N�o poder� rodar Quinta");
			break;
		case 9:
		case 0:
			System.out.println("N�o poder� rodar Sexta");
			break;
		default:
			System.out.println("N�mero de placa invalido");
			
			
		}
		
		in.close();
	}

}
