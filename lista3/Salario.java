
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sp, sm, resultado;
		
		System.out.println("Entre com o salário da pessoa:");
		sp = in.nextDouble();
		System.out.println("Entre com o salário minimo");
		sm = in.nextDouble();
		resultado = sp/sm;
		System.out.println("o resultado é " +resultado);
		if(resultado<1){
			System.out.println("Inadequado");
		}else {
			System.out.println("Adequado");
		}

	}

}
