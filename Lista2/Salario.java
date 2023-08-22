
import java.util.Scanner;
public class Salario {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double su, sm, resultado;
		
		System.out.println("Entre com o salário do usuario: ");
		su = in.nextDouble();
		System.out.println("Entre com o salário minimo: ");
		sm = in.nextDouble();
		
		resultado = su/sm;
		System.out.println("o resutado é " +resultado);
		
		in.close();
	}

}
