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
		System.out.println("O gasto do seu carro � " +t);
		if(t>=10) {
			System.out.println("seu carro � economico");
		}else { 
			System.out.println("Seu carro n�o � economico");
		}
		in.close();

	}

}
