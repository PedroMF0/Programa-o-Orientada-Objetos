package projeto007;
import javax.swing.JOptionPane;
public class Projeto007 {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(
          //null, "Enviando uma mensagem para o usuário"
          //Enviando mensaegm para outro usuário
        //);
        
        //icone de erro
        JOptionPane.showMessageDialog(
                null,
                 "Icone de erro",
                 "Titulo da janela",
                 JOptionPane.ERROR_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                 "Icone de informação",
                 "Titulo da janela",
                 JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                 "Icone de questão",
                 "Titulo da janela",
                 JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                 "Sem ícone",
                 "Titulo da janela",
                 JOptionPane.PLAIN_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null,
                "Digite seu nome: "
        );
        
        int num1 = Integer.parseInt(
                JOptionPane.showInputDialog(
                null,
                        "Digite um valor numérico inteiro: "
                )
        );
        
        
    }
}
    
        
    
