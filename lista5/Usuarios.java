package lista5;

import java.util.Scanner;
public class Usuarios {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade,idadeVelho,idadeNovo;
		String nome,nomeVelho,nomeNovo;
		
		System.out.println("Entre com o nome do us�ario:");
		nome = in.next();
		System.out.println("Entre com a idade do us�ario:");
		idade = in.nextInt();
		nomeVelho = nome;
		idadeVelho = idade;
		nomeNovo = nome;
		idadeNovo = idade;
		System.out.println("Entre com o nome do us�ario:");
		nome = in.next();
		System.out.println("Entre com a idade do us�ario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;	
		}
		System.out.println("Entre com o nome do us�ario:");
		nome = in.next();
		System.out.println("Entre com a idade do us�ario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;
		}
		System.out.println("Entre com o nome do us�ario:");
		nome = in.next();
		System.out.println("Entre com a idade do us�ario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;
		}
		System.out.println("Entre com o nome do us�ario:");
		nome = in.next();
		System.out.println("Entre com a idade do us�ario:");
		idade = in.nextInt();
		if(idade>idadeVelho) {
			nomeVelho = nome;
			idadeVelho = idade;		
		}else {
			nomeNovo = nome;
			idadeNovo = idade;
		}
		System.out.println("O us�ario mais velho � "+nomeVelho.equalsIgnoreCase(nomeVelho)+"com "+idadeVelho+"anos");
		System.out.println("O us�ario mais novo � "+nomeNovo.equalsIgnoreCase(nomeNovo)+"com "+idadeNovo+"anos");
		in.close();
	}
}