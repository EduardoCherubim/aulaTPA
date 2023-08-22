package lista5;

import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double g,m,imc;
		System.out.println("insira seu peso");
		g= in.nextDouble();
		System.out.println("insira sua altura");
		m= in.nextDouble();
		imc = g/(m*m);
		
		if(imc>40) {
			System.out.println("Você possui obesidade de 3° grau");
		}else if(imc>35) {
			System.out.println("Você possui obesidade de 2° grau");
		}else if(imc>30) {
			System.out.println("Você possui obesidade de 1° grau");
		}else if(imc>25) {
			System.out.println("Você possui excesso de peso");
		}else if(imc>18.5) {
			System.out.println("Você possui o peso ideal");
		}else {
			System.out.println("Você possui excesso de magreza");
		}
		in.close();
	

	}

}
