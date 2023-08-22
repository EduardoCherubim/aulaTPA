
import java.util.Scanner;
public class Algoritmo3 {
	
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Entre com o primeiro valor: ");
		a = in.nextInt();
		System.out.println("Entre com o segundo valor: ");
		b = in.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("O valor de a e b trocados são: A ="+a+" e B = "+b);
		
		in.close();
		
	}

}
