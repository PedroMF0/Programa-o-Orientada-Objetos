package projeto003;

public class ProjetoPessoa {
    
    public String nome;
    public int anoDeNascimento;
    public byte numeroDeFilhos;
    public double salario;
    
    
    public int calcularIdade(int anoAtual){
        return anoAtual - this.anoDeNascimento;
    }
     
    
}
