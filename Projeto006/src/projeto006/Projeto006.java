package projeto006;
import java.util.Scanner;
public class Projeto006 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Data dt = new Data();
        
        System.out.println("Digite o dia: ");
        dt.setDia(read.nextByte());
        
        System.out.println("Digite o mês: ");
        dt.setMes(read.nextByte());
        
        System.out.println("Digite o ano: ");
        dt.setAno(read.nextInt());
        
        
        System.out.println(dt.toString());
              
        // TODO code application logic here
    }
    
}
