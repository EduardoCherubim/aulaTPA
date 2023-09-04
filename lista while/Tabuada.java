package lista8;

import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1,n,r;
		System.out.println("Entre com um número:");
		n = in.nextInt();
		while(i<=10) {
			r = n*i;
			System.out.println(n+"X"+i+"="+r);
			i++;
		}
		in.close();
	}

}
