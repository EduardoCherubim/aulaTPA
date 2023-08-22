package lista5;

import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double s,irpf;
		
		System.out.println("Entre com o salário:");
		s = in.nextDouble();
	if (s>3582) {
		irpf = s * 27.5/100-662.94;
	}else if(s>2866.71) {
		irpf = s * 22.5/100-483.84;
	}else if(s>2150.01){
		irpf = s * 15/100-268.84;
	}else if (s>1434.60) {
		irpf = s * 7.5/100-107.59;
	}else {
		irpf = s/100;
	}
		System.out.println("O resultado será " +irpf);	
		in.close();
	}
}

