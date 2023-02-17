
package atividade2;

public class Atividade2 {

    
        private String nome;
        private int idade;
        private int cpf;
        private String cidade;
        private int telefone;
        private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String nome) {
        this.cidade = cidade;
    }
    
        

        public String toString(){
            return "\nNome: " +this.nome + "\nIdade: " + this.idade + "\nCPF:" + this.cpf + "\nTelefone:" + this.telefone + "\nEmail: " + this.email + "\nCidade: " + this.cidade;
        }
        
    
    
}
