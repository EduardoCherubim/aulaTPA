package lista5;

import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1,n2,m1,e ,m2;
		
		System.out.println("Entre com a primeira nota");
		n1 = in.nextDouble();
		System.out.println("Entre com a segunda nota");
		n2 = in.nextDouble();
		m1 = n1+n2/2;
		System.out.println("a média final é "+m1);
		if(m1>=6) {
			System.out.println("Aprovado");
		}else if(m1<3) {
			System.out.println("Reprovado");
		}else if (m1>=3) {
			System.out.println("Exame");
			System.out.println("Entre com a nota de exame");
			e = in.nextDouble();
			m2 = e = m1/2;
			if(m2>=6) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
			in.close();
		
		}
		
	}
}
