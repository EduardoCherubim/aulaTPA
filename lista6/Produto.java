package lista6;

import java.util.Scanner;
public class Produto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p;
		
		System.out.println("Entre com o pre�o do produto:");
		p = in.nextDouble();
		if (p>2000) {
			p = p*0.2;
		}else if(p>1000) {
			p = p*0.15;
		}else if(p>500) {
			p = p*0.1;
		}else if(p>100) {
			p = p*0.05;
		}else {
			System.out.println("Voc� n�o ter� desconto");
		}
		System.out.println("O pre�o do produto � "+p);
		
		in.close();
	}

}
