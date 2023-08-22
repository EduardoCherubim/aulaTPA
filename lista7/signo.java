package lista7;

import java.util.Scanner;
public class signo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m,d;
		
		System.out.println("Entre com o mês");
		m = in.nextInt();
		System.out.println("Entre com o dia");
		d = in.nextInt();
		
		switch(m) {
		case 1:
			if(d < 21) {
				System.out.println("Capricornio");
			}else {
				System.out.println("Aquario");
			}
			break;
		case 2:
			if(d < 20) {
				System.out.println("Aquario");
			}else {
				System.out.println("Peixes");
			}
			break;
		case 3:
			if(d < 21) {
				System.out.println("Peixes");
			}else {
				System.out.println("Aries");
			}
			break;
		case 4:
			if(d < 21) {
				System.out.println("Aries");
			}else {
				System.out.println("Touro");
			}
			break;
		case 5:
			if(d < 21) {
				System.out.println("Touro");
			}else {
				System.out.println("Gêmeos");
			}
			break;
		case 6:
			if(d < 21) {
				System.out.println("Gêmeos");
			}else {
				System.out.println("Câncer");
			}
			break;
		case 7:
			if(d < 20) {
				System.out.println("Câncer");
			}else {
				System.out.println("Leão");
			}
			break;
		case 8:
			if(d < 23) {
				System.out.println("Leão");
			}else {
				System.out.println("Virgem");
			}
			break;
		case 9:
			if(d < 23) {
				System.out.println("Virgem");
			}else {
				System.out.println("Libra");
			}
			break;
		case 10:
			if(d < 23) {
				System.out.println("Libra");
			}else {
				System.out.println("Escorpião");
			}
			break;
		case 11:
			if(d < 22) {
				System.out.println("Escorpião");
			}else {
				System.out.println("Sagitário");
			}
			break;
		case 12:
			if(d < 21) {
				System.out.println("Sagitário");
			}else {
				System.out.println("Capricornio");
			}
			break;
			default:
				System.out.println("Mês Inválido");
		}
		
		
		
		in.close();
	}

}
