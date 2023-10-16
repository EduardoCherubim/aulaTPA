
public class Tabuada {

	public static void main(String[] args) {
		int m=1,r;
		for(int i=1; i<=10; i++) {
			while(m<=10) {
				r = i*m;
				System.out.println(i+"X"+m+"="+r);
				m++;
			}
			m=1;
		}

	}

}