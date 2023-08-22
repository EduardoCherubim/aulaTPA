package lista7;

import java.util.Scanner;
public class nota {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,r,b,mb,total,p;
		String opcao;
		
		System.out.println("Quantos alunos tiraram I?");
		i = in.nextInt();
		System.out.println("Quantos alunos tiraram R?");
		r = in.nextInt();
		System.out.println("Quantos alunos tiraram B?");
		b = in.nextInt();
		System.out.println("Quantos alunos tiraram MB?");
		mb = in.nextInt();
		
		total = i + r + b + mb;
		
		System.out.println("Você quer a porcentagem de qual nota? MB, B, R ou I");
		opcao = in.next();
		
		switch(opcao) {
		case "mb":
		case "MB":
			p = mb*100/total;
			System.out.println("A porcentagem de alunos que tiraram essa nota é "+p+"%.");
			break;
		case "b":
		case "B":
			p = b*100/total;
			System.out.println("A porcentagem de alunos que tiraram essa nota é "+p+"%.");
			break;
		case "r":
		case "R":
			p = r*100/total;
			System.out.println("A porcentagem de alunos que tiraram essa nota é "+p+"%.");
			break;
		case "i":
		case "I":
			p = i*100/total;
			System.out.println("A porcentagem de alunos que tiraram essa nota é "+p+"%.");
			break;
		default:
			System.out.println("Nota Inválida");
		}
		
			
		in.close();
	}
}
