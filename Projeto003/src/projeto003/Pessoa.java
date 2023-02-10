package projeto003;
import java.util.Scanner;
public class Pessoa {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        ProjetoPessoa fi = new ProjetoPessoa();
        
        System.out.println("Digite seu nome: ");
        fi.nome = read.next();
        
        System.out.println("Digite seu ano de nascimento: ");
        fi.anoDeNascimento = read.nextInt();
        
        System.out.println("Digite o ano atual: ");
        int anoAtual = read.nextInt();
        
        System.out.println("Digite quantos filhos você possui: ");
        fi.numeroDeFilhos = read.nextByte();
        
        System.out.println("Digite o seu salario: ");
        fi.salario = read.nextDouble();
         
        
        System.out.println("Olá, " + fi.nome + " seu salário é R$" + fi.salario);
        System.out.println("Você possui " + fi.numeroDeFilhos + " filhos");
        System.out.println("Nasceu no ano de " + fi.anoDeNascimento +" e tem " + fi.calcularIdade(anoAtual) + " anos");
     
    }
}
         
       
       
    
