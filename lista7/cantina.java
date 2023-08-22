package lista7;

import java.util.Scanner;
public class cantina {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c;
		
		System.out.println("Entre com o código do produto");
		c = in.nextInt();
		
		switch(c) {
		
		case 1:
			System.out.println("Cachorro Quente "+ "R$18,00");
			break;
		case 2:
			System.out.println("Cheeseburguer "+ "R$12,00");
			break;
		case 3:
			System.out.println("X Salada "+ "R$15,00");
			break;
		case 4:
			System.out.println("Misto Quente "+ "R$11,00");
			break;
		case 5:
			System.out.println("Pão na Chapa "+ "R$6,00");
			break;
		default:
			System.out.println("Código inválido");
			break;
		}
		
		
		in.close();
	}

}
