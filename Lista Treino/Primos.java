
import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n;
		
		System.out.println("Entre com o n�mero");
		n = in.nextInt();
		if(n%2==0||n%3!=0) {
			System.out.println(n+" N�o  � primo");
		}else {
			System.out.println(n+" � primo");
		}
		in.close();
	}

}
