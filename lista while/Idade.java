package lista8;

import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1,id;
		
		while(i<=5) {
			System.out.println("Entre com a "+i+"a idade:");
			id = in.nextInt();
			System.out.println(id);
			if(id>18) {
				System.out.println("Maior de idade");
			}else {
				System.out.println("Menor de idade");
			}
			i++;
		}
		in.close();

	}

}
