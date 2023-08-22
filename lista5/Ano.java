package lista5;

import java.util.Scanner;
public class Ano {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nasc, atual,idade;
		
		System.out.println("Entre com o ano de nascimento");
		nasc = in.nextInt();
		System.out.println("Entre com o ano atual");
		atual = in.nextInt();
		idade = atual-nasc;
		System.out.println("Sua idade é " +idade);
		
		if(idade>=60) {
			System.out.println("Idoso");
		}else if(idade>=18) {
			System.out.println("Adulto");
		}else if(idade>=10) {
			System.out.println("Adolecente");
	    }else {
	    	System.out.println("Criança");
	    }
		in.close();
	}

}
