import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int id, fe1=0,fe2=0,fe3=0,fe4=0,fe5=0;
		double p1,p2,p3,p4,p5;
		for(int i=1;i<=15;i++) {
			System.out.println("Entre com a idade do "+i+"� usuario:");
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
		
		System.out.println("1� faixa et�ria "+fe1+" pessosas. Porcentagem da faixa et�ria "+p1+"%");
		System.out.println("2� faixa et�ria "+fe2+" pessosas. Porcentagem da faixa et�ria "+p2+"%");
		System.out.println("3� faixa et�ria "+fe3+" pessosas. Porcentagem da faixa et�ria "+p3+"%");
		System.out.println("4� faixa et�ria "+fe4+" pessosas. Porcentagem da faixa et�ria "+p4+"%");
		System.out.println("5� faixa et�ria "+fe5+" pessosas. Porcentagem da faixa et�ria "+p5+"%");
		in.close();
	}

}
