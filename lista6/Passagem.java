package lista6;

import java.util.Scanner;
public class Passagem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p, dm, v, vt;
		String d, a;
		
		System.out.println("Insira o pre�o da passsagem:");
		p = in.nextDouble();
		System.out.println("Vai despachar malas?");
		d = in.next();
		System.out.println("Vai querer marcar o seu assento?");
		a = in.next();
		if (d == "Sim") {
			System.out.println("Quantas malas voc� vai querer despejar?");
			dm = in.nextDouble();
			v = dm * 90 + p;
		}
		if ( a == "Sim") {
			vt = v + 60;
		}
		System.out.println("O valo total � "+vt);

	}

}
