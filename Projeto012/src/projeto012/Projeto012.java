
package projeto012;
import java.util.ArrayList;
public class Projeto012 {
    
    private String nome;
    private String telefone;
    private String email;
    private String sexo;
    private ArrayList pagamento;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList getPagamento() {
        return pagamento;
    }

    public void setPagamento(ArrayList pagamento) {
        this.pagamento = pagamento;
    }
    
    
    public String toString(){
        return "\nNome:" + this.nome + "\nTelefone:" + this.telefone + "\nEmail:" + this.email + "\nSexo:" + this.sexo + "\nPagamento:" + this.pagamento;
                
    }
    
    

}
   
   
    

