import java.util.Random;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Random ran = new Random();
            Scanner in = new Scanner(System.in);
            int v[][] = new int [4] [4];
            int i,j,n,d=0;
        
        for(i = 0; i<4; i++){
             for(j=0; j<4; j++){
                 v[i][j] = ran.nextInt()%100;
              }
             
             for(i = 0; i<4;i++){
                for(j=0; j<4; j++){
                    System.out.println("Entre com o número cantado:");
                    n = in.nextInt();
                    if(v[i][j] == n){
                        System.out.println("Possui número");
                         d++;
                    }else{
                        System.out.println("Não possui número");
                    }
                    
                }
                
            }
            
             for(i = 0; i<4;i++){
                for(j=0; j<4; j++){
                    if(d==16){
                        System.out.println("Bingo");
                    }else{
                        System.out.println("Cartela incorreta");
                    }
                }
                 
             }
            
          }
        
    }
    
}