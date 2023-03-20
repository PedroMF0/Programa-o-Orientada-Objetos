package atividadeavaliativafinal;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;


public class AtividadeAvaliativaUC {

    
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int maxTentativas = 20;
        int randomNumber = random.nextInt(1000) + 1;
        System.out.println("Bem-Vindo ao jogo de adivinhação!");
        System.out.println("Você tem " + maxTentativas + " para acertar o número aleatório.");

        for (int i = 1; i <= maxTentativas; i++) {
            System.out.print("\nResposta #" + i + ": ");
            int resposta = read.nextInt();

            if (resposta == randomNumber) {
                System.out.println("Parabéns!Você acertou o número!");
                return;
            }
            if(resposta > randomNumber){
                System.out.print("Tente um número menor.");
            } if (resposta < randomNumber){
                System.out.print("Tente um número maior.");
            }
            else if (i == maxTentativas) {
                System.out.println("As suas tentativas acabaram! O número certo era: " + randomNumber + ".");
            }
        }
    }
}

 
    

        
    
    

