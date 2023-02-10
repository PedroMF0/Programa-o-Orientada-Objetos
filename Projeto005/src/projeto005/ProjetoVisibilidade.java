package projeto005;
import java.util.Scanner;
public class ProjetoVisibilidade {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PessoaVisibilidade pv = new PessoaVisibilidade();
        
        System.out.println("Digite seu nome: ");
        pv.nome = read.nextLine();
        
        System.out.println("Digite sua idade: ");
        pv.setIdade(read.nextInt());
        
        System.out.println("Digite seu peso: ");
        pv.setPeso(read.nextDouble());

        
        System.out.println("Olá, " + pv.nome);
        System.out.println("Você tem " + pv.getIdade() + " anos");
        System.out.println("E " + pv.getPeso() + " kg");
 
    }
    
}
   
    
