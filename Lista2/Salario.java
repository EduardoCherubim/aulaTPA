
import java.util.Scanner;
public class Salario {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double su, sm, resultado;
		
		System.out.println("Entre com o sal�rio do usuario: ");
		su = in.nextDouble();
		System.out.println("Entre com o sal�rio minimo: ");
		sm = in.nextDouble();
		
		resultado = su/sm;
		System.out.println("o resutado � " +resultado);
		
		in.close();
	}

}
