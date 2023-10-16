import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int id, fe1=0,fe2=0,fe3=0,fe4=0,fe5=0;
		double p1,p2,p3,p4,p5;
		for(int i=1;i<=15;i++) {
			System.out.println("Entre com a idade do "+i+"° usuario:");
			id = in.nextInt();
			if(id<=15) {
				fe1 = fe1+1;
			}else if(id<=30) {
				fe2 = fe2+1;
			}else if(id<=45) {
				fe3 = fe3+1;
			}else if(id<=60) {
				fe4 = fe4+1;
			}else {
				fe5 = fe5+1;
			}
		}
		p1 = fe1*100/15;
		p2 = fe2*100/15;
		p3 = fe3*100/15;
		p4 = fe4*100/15;
		p5 = fe5*100/15;
		
		System.out.println("1° faixa etária "+fe1+" pessosas. Porcentagem da faixa etária "+p1+"%");
		System.out.println("2° faixa etária "+fe2+" pessosas. Porcentagem da faixa etária "+p2+"%");
		System.out.println("3° faixa etária "+fe3+" pessosas. Porcentagem da faixa etária "+p3+"%");
		System.out.println("4° faixa etária "+fe4+" pessosas. Porcentagem da faixa etária "+p4+"%");
		System.out.println("5° faixa etária "+fe5+" pessosas. Porcentagem da faixa etária "+p5+"%");
		in.close();
	}

}
