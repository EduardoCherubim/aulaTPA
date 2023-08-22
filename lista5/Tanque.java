package lista5;

import java.util.Scanner;
public class Tanque {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double km,l,t;
		System.out.println("Insira a quilometragem");
		km = in.nextDouble();
		System.out.println("Insira a quantia do tanque");
		l = in.nextDouble();
		t = km/l;
		System.out.println("O gasto do seu carro é " +t);
		if(t>=10) {
			System.out.println("seu carro é economico");
		}else { 
			System.out.println("Seu carro não é economico");
		}
		in.close();

	}

}
