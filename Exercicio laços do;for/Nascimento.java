
import java.util.Scanner;
public class Nascimento  {
    
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int i=1, anoNasc, anoAtual, idade, cont;
        do{
            System.out.println("qual o ano atual?");
            anoAtual = in.nextInt();
            
            System.out.println("qual o ano de nascimento?");
            anoNasc = in.nextInt();
            
            idade = anoAtual-anoNasc;
            
            System.out.println("tua idade é de "+idade);
            
            if(idade<19){
                System.out.println("Menor de idade");
            }else {
                System.out.println("Maior de idade");
            }
            System.out.println("Você quer repetir o questionario? digite '1' pra sim e '2' pra não");
            cont = in.nextInt();
        }while (cont==1);
        System.out.println("Obrigado");
        in.close();
    }
    
}