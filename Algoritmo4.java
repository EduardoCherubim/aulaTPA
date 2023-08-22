
import java.util.Scanner;
public class Algoritmo4 {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		int dia,mes,ano;
		
		System.out.println("Entre com a quantidade de dias: ");
		dia = in.nextInt();
		
		mes=in.nextInt()/30;
	
		ano=mes/12;
		
		System.out.println("A quantidade de dias convertido em anos é "+ano);
		
		in.close();
				
		
	}
}
