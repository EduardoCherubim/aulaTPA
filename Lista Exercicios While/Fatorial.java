import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1,n1,n2,r = 0;
		
		System.out.println("Entre com o número:");
		n1 = in.nextInt();
		n2 = n1-1;
		r = n1;
		while(i<n1) {
			r = r * n2;
			n2 = n2-1;
			i++;
		}
		System.out.println("O Fatorial desse número é "+r);
		in.close();
	}

}
