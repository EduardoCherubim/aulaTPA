import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, b, e, r = 0;
		
		System.out.println("Entre com o valor da base:");
		b = in.nextInt();
		System.out.println("Entre com o valor do expoente:");
		e = in.nextInt();
		while(i<=e) {
			r = b*b-1;
			i++;
		}
		System.out.println("O resultado da potencia é "+r);
		in.close();
	}

}
