package lista5;

import java.util.Scanner;
public class Usuarios {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade,idadeVelho,idadeNovo;
		String nome,nomeVelho,nomeNovo;
		
		System.out.println("Entre com o nome do usúario:");
		nome = in.next();
		System.out.println("Entre com a idade do usúario:");
		idade = in.nextInt();
		nomeVelho = nome;
		idadeVelho = idade;
		nomeNovo = nome;
		idadeNovo = idade;
		System.out.println("Entre com o nome do usúario:");
		nome = in.next();
		System.out.println("Entre com a idade do usúario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;	
		}
		System.out.println("Entre com o nome do usúario:");
		nome = in.next();
		System.out.println("Entre com a idade do usúario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;
		}
		System.out.println("Entre com o nome do usúario:");
		nome = in.next();
		System.out.println("Entre com a idade do usúario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;
		}
		System.out.println("Entre com o nome do usúario:");
		nome = in.next();
		System.out.println("Entre com a idade do usúario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;
		}
		System.out.println("O usúario mais velho é "+nomeVelho.equalsIgnoreCase(nomeVelho)+"com "+idadeVelho+"anos");
		System.out.println("O usúario mais novo é "+nomeNovo.equalsIgnoreCase(nomeNovo)+"com "+idadeNovo+"anos");
		in.close();
	}
}